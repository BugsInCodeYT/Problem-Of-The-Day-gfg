#  >> PYTHON CODE <<

class Solution:
    def count(self, coins, N, Sum):
        dp=[[0 for i in range(Sum+1)] for j in range(N+1) ]
        
        for i in range(N,-1,-1):
            for j in range(Sum,-1,-1):
                if(j==Sum): dp[i][j]=1
                elif i==N: dp[i][j]=0
                else:
                    if(j+coins[i]>Sum):
                        dp[i][j]=dp[i+1][j] if (i+1)<=N else 0
                    else:
                        dp[i][j]=(dp[i][j+coins[i]]) + (dp[i+1][j] if (i+1)<=N else 0)
        
        return dp[0][0]

