//  >> C++ MEMO <<

long long solve(int i, int prevTaken, vector<int>& arr, vector<vector<long long>>& dp) {

    if (i >= arr.size()) return 0;
    
    if (dp[i][prevTaken] != -1) return dp[i][prevTaken];
    
    if (prevTaken == 0) {
        return dp[i][prevTaken] = solve(i+1, 1, arr, dp) + arr[i];
    } else {
        return dp[i][prevTaken] = max(solve(i+1, 1, arr, dp) + arr[i], solve(i+1, 0, arr, dp));
    }

}


long long findMaxSubsetSum(int N, vector<int>& A) {

    vector<vector<long long>> dp(N, vector<long long>(2, -1));
    
    	return max(solve(0, 0, A, dp), solve(0, 1, A, dp));

}