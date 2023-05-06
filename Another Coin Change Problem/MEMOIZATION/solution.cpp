//  >> C++: MEMOIZATION <<

class Solution {
    public boolean solve(int N, int K, int target, List<Integer> coins, int[][] dp) {
        if (K == 0 && target == 0) return true;
        if (K <= 0 || target <= 0) return false;
        if (dp[K][target] != -1) return dp[K][target] == 1;
        boolean ans = false;
        for (int i = 0; i < N; i++) {
		if(target>=coins[i])
                ans |= solve(N, K - 1, target - coins[i], coins, dp);
        }
        dp[K][target] = ans ? 1 : 0;
        return ans;
    }

    public boolean makeChanges(int N, int K, int target, List<Integer> coins) {
        int[][] dp = new int[K + 1][target + 1];
        for (int i = 0; i <= K; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(N, K, target, coins, dp);
    }
}