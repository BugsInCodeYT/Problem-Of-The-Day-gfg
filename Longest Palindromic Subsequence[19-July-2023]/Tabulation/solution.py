#   >> PYTHON CODE: TABULATION <<

class Solution:

    def longestPalinSubseq(self, S):
        dp=[[0 for i in range(len(S)+1)] for j in range(len(S)+1)]
        rev=S[::-1]
        
        n=len(S)
        
        for i in range(n,-1,-1):
            for j in range(n,-1,-1):
                if(i==n or j==n): dp[i][j]=0
                elif S[i]==rev[j]: dp[i][j]=1+dp[i+1][j+1]
                else: dp[i][j]=max(dp[i+1][j],dp[i][j+1])
                
        return dp[0][0]