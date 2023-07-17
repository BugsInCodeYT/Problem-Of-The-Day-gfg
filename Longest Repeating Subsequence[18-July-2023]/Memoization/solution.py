#  >> PYTHON CODE MEMOIZATION <<

#User function Template for python3

class Solution:
    def LongestRepeatingSubsequence(self, str):
        def solve(i,j,str_a,str_b,dp):
            if(i==len(str_a)): return 0
            if(j==len(str_b)): return 0
            
            if(dp[i][j]!=-1): return dp[i][j]
            
            
            if(i!=j and str_a[i]==str_b[j]):
                dp[i][j]=1+solve(i+1,j+1,str_a,str_b,dp)
            else:
                dp[i][j]=max(solve(i+1,j,str_a,str_b,dp),solve(i,j+1,str_a,str_b,dp))
        
            return dp[i][j]
            
        dp=[[-1 for i in range(len(str)+1)] for j in range(len(str)+1)]
        
        return solve(0,0,str,str,dp)
