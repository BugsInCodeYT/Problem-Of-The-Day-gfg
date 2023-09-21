# >> PYTHON TABULATION CODE <<

class Solution:  
    
    #Function to find the maximum money the thief can get.
    def FindMaxSum(self,a, n):
        
        dp=[0]*(n+1)
        
        dp[n]=0
        dp[n-1]=a[n-1]
        
        for i in range(n-2,-1,-1):
            dp[i]=max(a[i]+dp[i+2],dp[i+1])
        
        return dp[0]