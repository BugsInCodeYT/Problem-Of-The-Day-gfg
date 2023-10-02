#  >> PYTHON CODE <<

class Solution:
    def distinctSubsequences(self, S):
        mod = 10**9 + 7
        n = len(S)
        dp = [0] * (n + 1)
        dp[0] = 1
        lo = {}
        
        for i in range(1, n + 1):
            dp[i] = (2 * dp[i - 1]) % mod
            ch = S[i - 1]
            
            if ch in lo:
                j = lo[ch]
                dp[i] = (dp[i] - dp[j] + mod) % mod
            lo[ch] = (i - 1) % mod
        
        return int(dp[n] % mod)