//  >> CPP CODE <<

class Solution{
  public:
    int longestKSubstr(string s, int k) {
        
        int st = 0, end = 0;
        int n = s.length();
    
        unordered_map<char, int> mp;
        int ans = -1;
        
        while (end < n) {
            mp[s[end]] = mp[s[end]] + 1;
    
            int distChars = mp.size();
    
            if (distChars == k)
                ans = max(ans, end - st + 1);
            else if (distChars > k) {
                mp[s[st]] = mp[s[st]] - 1;
                if (mp[s[st]] == 0)
                    mp.erase(s[st]);
    
                st += 1;
            }
    
            end += 1;
        }
    
        return ans;
        
    }
};