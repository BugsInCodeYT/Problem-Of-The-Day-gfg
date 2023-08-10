#  >> PYTHON CODE <<

class Solution:
    
    #Function to find the length of longest common subsequence in two strings.
    def lcs(self,x,y,s1,s2):
        
        dp=[[0 for i in range(y+1)] for _ in range(x+1)]
        
        
        for i in range(x,-1,-1):
            for j in range(y,-1,-1):
                if(i==x or j==y): dp[i][j]=0
                elif s1[i]==s2[j]:
                    dp[i][j]=1+dp[i+1][j+1]
                else:
                    dp[i][j]=max(dp[i+1][j],dp[i][j+1])

        return dp[0][0]