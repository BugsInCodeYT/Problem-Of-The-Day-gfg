//   >> C++ CODE <<


class Solution {
    int mod;
    vector<int> mp;
    public:
        Solution() {
            mod = (int) 1e9 + 7;
            mp.assign(31, 0);
            int prime[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
            for (int i = 2; i <= 30; ++i) {
                if (i % 4 == 0 || i % 9 == 0 || i == 25) continue;
                int mask = 0;
                for (int j = 0; j < 10; ++j) {
                    if (i % prime[j] == 0) mask |= 1 << j;
                }
                mp[i] = mask;
            }
        }
    
        long long pow(int n) {
            long long ans = 1, m = 2;
            while (n != 0) {
                if ((n & 1) == 1) ans = (ans * m) % mod;
                m = (m * m) % mod;
                n >>= 1;
            }
            return ans;
        }
    
        int goodSubsets(vector<int>& arr, int n) {
            int one = 0;
            vector<int> dp(1024), cnt(31);
            dp[0] = 1;
            for (int i = 0; i < n; ++i) {
                if (arr[i] == 1) {
                    one++;
                } else if (mp[arr[i]] != 0) {
                    cnt[arr[i]]++;
                }
            }
            for (int i = 0; i < 31; ++i) {
                if (cnt[i] == 0) continue;
                for (int j = 0; j < 1024; ++j) {
                    if ((j & mp[i]) != 0) continue;
                    dp[j | mp[i]] = (dp[j | mp[i]] + dp[j] * 1LL * cnt[i]) % mod;
                }
            }
            long long ans = 0;
            for (int i = 0; i < 1024; ++i) {
                ans = (ans + dp[i]) % mod;
            }
            ans--;
            if (one != 0) {
                ans = (ans * pow(one)) % mod;
            }
            return (int) ans;
        }
};