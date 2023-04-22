//     >> C++ CODE <<


vector<long long> smallerSum(int n, vector<int>& arr) {
        vector<long long> ans;
        for (int i = 0; i < n; i++) {
            long long cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    cnt += arr[j];
                }
            }
            ans.push_back(cnt);
        }
        return ans;
    }