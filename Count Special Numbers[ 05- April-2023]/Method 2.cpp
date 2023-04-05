//           >> C++ CODE <<

int countSpecialNumbers(int N, vector<int> arr) {
        
        
        unordered_map<int, int> map;
        int MAX = INT_MIN;
        for (int in : arr) {
            MAX = max(MAX, in);
        }
        
        vector<bool> factors(MAX+1, false);
        for (int i = 0; i < N; i++) {
            if (map.count(arr[i])) { 
                map[arr[i]]++;
                continue;
            }
            for (int j = 2 * arr[i]; j <= MAX; j += arr[i]) {
                factors[j] = true;
            }
            map[arr[i]]++;
        }
        
        int ans = 0;
        for (int i : arr) {
            if (factors[i] || map[i] > 1) {
                ans++;
            }
        }
        return ans;
        
    }