//  >> C++ CODE <<

int LargButMinFreq(int arr[], int n) {
        unordered_map<int, int> map;
    
        for (int i = 0; i < n; i++) {
            map[arr[i]]++;
        }
    
        int ans = INT_MIN;
        int freq = INT_MAX;
        for (auto& entry : map) {
            int key = entry.first;
            int count = entry.second;
    
            if (count < freq) {
                ans = key;
                freq = count;
            } else if (count == freq) {
                ans = max(ans, key);
            }
        }
    
        return ans;
    }