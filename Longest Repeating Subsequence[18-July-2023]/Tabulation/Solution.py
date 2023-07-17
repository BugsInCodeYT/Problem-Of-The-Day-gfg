#  >> PYTHON CODE: TABULATION <<

class Solution:
	def LongestRepeatingSubsequence(self, str):
		dp=[[-1 for i in range(len(str)+1)] for j in range(len(str)+1)]
		
		n=len(str)
		
		for i in range(n,-1,-1):
		    for j in range(n,-1,-1):
		        if(i==len(str) or (j==len(str))): dp[i][j]=0
		        elif i!=j and str[i]==str[j]: dp[i][j]=1+dp[i+1][j+1]
		        else: dp[i][j]=max(dp[i+1][j],dp[i][j+1])
		 
		return dp[0][0]