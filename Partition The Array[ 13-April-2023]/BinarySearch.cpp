//  >> C++ CODE <<


vector<long> maxMin(vector<long>& prefixSum, int l, int h) {
    int low = l, high = h;
    long maxSum = LONG_MAX, minSum = 0;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        long leftSum = prefixSum[mid] - ((l - 1) >= 0 ? prefixSum[l - 1] : 0);
        long rightSum = prefixSum[h] - prefixSum[mid];

        if (abs(rightSum - leftSum) < maxSum - minSum) {
            maxSum = max(rightSum, leftSum);
            minSum = min(leftSum, rightSum);
        }

        if (leftSum < rightSum) low = mid + 1;
        else high = mid - 1;
    }

    return vector<long>{minSum, maxSum};
    }
    
    long minDifference(int N, vector<int>& A) {
        vector<long> prefixSum(N);
    
        prefixSum[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
    
        long ans = LONG_MAX;
    
        for (int i = 1; i < N - 2; i++) {
            vector<long> maxMinLeft = maxMin(prefixSum, 0, i);
            vector<long> maxMinRight = maxMin(prefixSum, i + 1, N - 1);
    
            long value = max(maxMinLeft[1], maxMinRight[1]) - min(maxMinLeft[0], maxMinRight[0]);
            ans = min(ans, value);
        }
    
        return ans;
    }