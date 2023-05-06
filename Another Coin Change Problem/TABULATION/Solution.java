//  >> JAVA: TABULATION <<

public static boolean makeChanges(int N, int K, int target, int[] coins) {
        boolean[][] dp = new boolean[K + 1][target + 1];
        dp[0][0] = true;
        for (int i = 1; i < K + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                for (int coin : coins) {
                    if (j < coin) continue;
                    dp[i][j] |= dp[i - 1][j - coin];
                }
            }
        }
        return dp[K][target];
}