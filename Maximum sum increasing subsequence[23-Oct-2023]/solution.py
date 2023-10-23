#  >> PYTHON CODE <<

class Solution:
	def maxSumIS(self, Arr, n):
		
		dp=[0]*n
		
		for i in range(n): dp[i]=Arr[i]

		for i in range(n):
		    mx=0
		    for j in range(i-1,-1,-1):
		        if(Arr[j]<Arr[i]):
		            mx=max(mx,dp[j])
		    dp[i]+=mx
		
		
		return max(dp)