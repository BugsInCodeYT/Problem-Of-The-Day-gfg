bool makePalindrome(int n,vector<string> &arr){
        unordered_map<string, int> map;
    
        for (int i = 0; i < n; i++) {
            string str = arr[i];
            map[str] = map[str] + 1;
        }
        
        for (int i = 0; i < n; i++) {
            string str = arr[i];
            string rev(str.rbegin(), str.rend());
        
            if (map[str] != map[rev]) {
                if (str != rev) {
                    return false;
                }
            }
        }
        
        return true;
    }