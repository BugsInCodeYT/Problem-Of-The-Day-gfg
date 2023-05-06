#  >> PYTHON: TABULATION <<

class Solution:
    def makeChanges(self,N, K, target, coins):
        dp = [[False] * (target+1) for _ in range(K+1)]
        dp[0][0] = True
        for i in range(1, K+1):
            for j in range(1, target+1):
                for coin in coins:
                    if j < coin:
                        continue
                    dp[i][j] |= dp[i-1][j-coin]
                    
        return dp[K][target]


