#  >> PYTHON CODE: MEMOIZATION <<

class Solution:

    def longestPalinSubseq(self, S):
        def solve(i,j,A,B,dp):
            if i==len(A) or j==len(B):
                dp[i][j]=0
                return dp[i][j]
            
            if(dp[i][j]!=-1): return dp[i][j]
            
            if(A[i]==B[j]):
                dp[i][j]=1+solve(i+1,j+1,A,B,dp)
                return dp[i][j]
                
                
            dp[i][j]=max(solve(i+1,j,A,B,dp),solve(i,j+1,A,B,dp))
            return dp[i][j]
        
        dp=[[-1 for i in range(len(S)+1)] for j in range(len(S)+1)]
            
        return solve(0,0,S,S[::-1],dp)
