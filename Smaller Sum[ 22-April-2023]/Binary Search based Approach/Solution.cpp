//   C++ CODE 


int binarySearch(int val, vector<int>& arr) {
        int low = 0, high = arr.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < val) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    vector<long long> smallerSum(int n, vector<int>& arr) {
        vector<long long> ans(n);
        int in = 0;
        vector<long long> prefixSum(n);
        vector<int> arrcpy(arr);
        sort(arrcpy.begin(), arrcpy.end());
        prefixSum[0] = arrcpy[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arrcpy[i];
        }
        for (int i = 0; i < n; i++) {
            int index = binarySearch(arr[i], arrcpy);
            if (index != 0) {
                ans[in++] = prefixSum[index-1];
            } else {
                in++;
            }
        }
        return ans;
    }
