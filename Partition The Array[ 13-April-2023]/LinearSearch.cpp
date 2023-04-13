//  >> LINEAR SEARCH <<


vector<long long> maxMin(vector<long long>& prefixSum, int l, int r) {
        long long maxSum = LLONG_MAX, minSum = 0;
        for (int i = l; i < r; i++) {
            long long leftSum = prefixSum[i] - ((l - 1) >= 0 ? prefixSum[l - 1] : 0);
            long long rightSum = prefixSum[r] - prefixSum[i];
    
            if (abs(rightSum - leftSum) < maxSum - minSum) {
                maxSum = max(leftSum, rightSum);
                minSum = min(leftSum, rightSum);
            }
        }
        return {minSum, maxSum};
    }

    long long minDifference(int N, vector<int>& A) {
        vector<long long> prefixSum(N);
        prefixSum[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        long long ans = LLONG_MAX;
        for (int i = 1; i < N - 2; i++) {
            vector<long long> maxMinLeft = maxMin(prefixSum, 0, i);
            vector<long long> maxMinRight = maxMin(prefixSum, i + 1, N - 1);
            long long value = max(maxMinLeft[1], maxMinRight[1]) - min(maxMinLeft[0], maxMinRight[0]);
            ans = min(ans, value);
        }
        return ans;
    }