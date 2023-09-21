#   >> PYTHON MEMOIZATION CODE <<

class Solution:  
    
    #Function to find the maximum money the thief can get.
    def FindMaxSum(self,a, n):
        def solve(i,a,n,dp):
            if(i>=n): return 0
            
            if(dp[i]!=-1): return dp[i]
            
            dp[i]=max(a[i]+solve(i+2,a,n,dp),solve(i+1,a,n,dp))
            return dp[i]
        
        dp=[-1]*n
            
        return solve(0,a,n,dp)
