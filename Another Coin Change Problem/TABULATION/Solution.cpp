//  >> C++: TABULATION <<

bool makeChanges(int N, int K, int target, vector<int> coins) {
        bool dp[K + 1][target + 1];
        memset(dp, false, sizeof(dp));
        dp[0][0] = true;
        for (int i = 1; i < K + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                for (int k = 0; k < N; k++) {
                    if (j < coins[k]) continue;
                    dp[i][j] |= dp[i - 1][j - coins[k]];
                }
            }
        }
        return dp[K][target];
}