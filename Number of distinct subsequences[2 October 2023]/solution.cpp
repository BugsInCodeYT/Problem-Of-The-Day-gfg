//  >> CPP CODE <<

class Solution {
public:
    int distinctSubsequences(string S) {
        int mod = 1000000007;
        int n = S.length();
        vector<long long> dp(n + 1, 0);

        dp[0] = 1;
        unordered_map<char, int> lo;

        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % mod;
            char ch = S[i - 1];

            if (lo.count(ch)) {
                int j = lo[ch];
                dp[i] = (dp[i] - dp[j] + mod) % mod;
            }
            lo[ch] = (i - 1) % mod;
        }

        return int(dp[n] % mod);
    }
};