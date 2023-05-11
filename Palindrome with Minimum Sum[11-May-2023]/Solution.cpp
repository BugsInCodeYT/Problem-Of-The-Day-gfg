//  >> C++ CODE <<



class Solution {
  public:
     int minimumSum(string s) {
        
        //lambda function to check 
        auto possible = [](string s) {
            int low = 0, high = s.length() - 1;
            while (low < high) {
                if (s[low] != '?' && s[high] != '?' && s[low] != s[high]) {
                    return false;
                }
                low++;
                high--;
            }
            return true;
        };
        
        
        //lambda function to solve
        auto solve = [](string st) {
            int n = st.length(), i = 0, low = 0, high = n - 1;
            char s[n+1];
            strcpy(s, st.c_str());
            
            while (low < high) {
                if (s[low] == '?') {
                    s[low] = s[high];
                }
                else if (s[high] == '?') {
                    s[high] = s[low];
                }
                low++;
                high--;
            }
            
            while (i < n && s[i] == '?') {
                i++;
            }
            if (i == n) {
                return 0;
            }
            
            int ans = 0;
            char prev = s[i];
            for (int x = i; x < n; x++) {
                if (s[x] == '?') {
                    s[x] = prev;
                }
                ans += abs(s[x] - prev);
                prev = s[x];
            }
            
            return ans;
        };
        
        
        //starting point
        if (!possible(s)) {
            return -1;
        }
        else {
            return solve(s);
        }
    }
};