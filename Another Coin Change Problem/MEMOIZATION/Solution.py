//  >> PYTHON: MEMOIZATION
from typing import List


class Solution:
    def solve(self, N, K, target, coins, dp):
        if K == 0 and target == 0:
            return True
        if dp[K][target] != None:
            return dp[K][target]
        ans = False
        for i in range(N):
            if(target>=coins[i] and K-1>=0):
                ans |= self.solve(N, K - 1, target - coins[i], coins, dp)
        dp[K][target] = ans
        return ans
    
    def makeChanges(self, N, K, target, coins):
        dp = [[None for _ in range(target + 1)] for _ in range(K + 1)]
        return self.solve(N, K, target, coins, dp)  
 
