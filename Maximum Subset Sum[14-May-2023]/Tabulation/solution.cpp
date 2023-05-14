//  >> C++ TABULATION <<

long long findMaxSubsetSum(int N, vector<int>& A) {
    vector<vector<long long>> dp(N+1, vector<long long>(2, 0));
    
    dp[N][0]=0;
    dp[N][1]=0;
    
    for(int i=N-1;i>=0;i--)
    {
        dp[i][0]=dp[i+1][1];
        dp[i][1]=A[i]+max(dp[i+1][0],dp[i+1][1]);
    }
    
        return max(dp[0][0],dp[0][1]);
}