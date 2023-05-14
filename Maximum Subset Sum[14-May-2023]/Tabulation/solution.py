#  >> PYTHON TABULATION <<

def findMaxSubsetSum(self, N : int, A : List[int]) -> int:
    dp=[[0]*2 for _ in range(N+1)]
    
    dp[N][0]=0
    dp[N][1]=0
    
    for i in range(N-1,-1,-1):
        dp[i][0]=dp[i+1][1]
        dp[i][1]=A[i]+max(dp[i+1][1],dp[i+1][0])

    return max(dp[0][0],dp[0][1])