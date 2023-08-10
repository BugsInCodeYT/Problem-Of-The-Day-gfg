#  >> PYTHON CODE <<

import sys
sys.setrecursionlimit(1000000000)

class Solution:
    
    #Function to find the length of longest common subsequence in two strings.
    def lcs(self,x,y,s1,s2):
        
        def solve(i,j,s1,s2,dp):
            if(i==len(s1) or j==len(s2)):
                dp[i][j]=0
                return dp[i][j]
            
            if(dp[i][j]!=-1): return dp[i][j]
            
            if(s1[i]==s2[j]):
                dp[i][j]=1+solve(i+1,j+1,s1,s2,dp)
                return dp[i][j]
                
            dp[i][j]=max(solve(i,j+1,s1,s2,dp),solve(i+1,j,s1,s2,dp))
            return dp[i][j]
        
        dp=[[-1 for i in range(y+1)] for _ in range(x+1)]
        return solve(0,0,s1,s2,dp)