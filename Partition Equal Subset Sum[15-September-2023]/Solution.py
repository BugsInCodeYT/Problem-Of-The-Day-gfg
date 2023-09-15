//   >> PYTHON CODE <<

class Solution:
    def check(self,i,sm,target,arr,N,dp):
        if(sm==target): return True
        if(i==N): return False
        
        if(dp[i][sm] is not None): return dp[i][sm]
        
        if(sm+arr[i]>target):
            dp[i][sm]=self.check(i+1,sm,target,arr,N,dp)
            return dp[i][sm]
        
        dp[i][sm]=self.check(i+1,sm+arr[i],target,arr,N,dp) or self.check(i+1,sm,target,arr,N,dp)
        return dp[i][sm]
        
    def equalPartition(self, N, arr):
        
        sm=sum(arr)
        if(sm%2==1): return False
        
        dp=[[None for i in range(sm)] for _ in range(N)]
        
        half=sm/2
        
        return self.check(0,0,half,arr,N,dp)