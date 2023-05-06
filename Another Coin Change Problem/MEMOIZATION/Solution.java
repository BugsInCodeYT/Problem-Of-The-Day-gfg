//  >> JAVA: MEMOIZATION <<

class Solution {
    public boolean solve(int N, int K, int target,int[] coins, Boolean[][] dp) {
        if (K == 0 && target == 0) return true;
        if (K <= 0 || target <= 0) return false;
        if (dp[K][target] != null) return dp[K][target];
        boolean ans = false;
        for (int i = 0; i < N; i++) {
            if(target>=coins[i])
                ans |= solve(N, K - 1, target - coins[i], coins, dp);
        }
        dp[K][target] = ans;
        return ans;
    }

    public boolean makeChanges(int N, int K, int target,int[] coins) {
        Boolean[][] dp = new Boolean[K + 1][target + 1];
        
        return solve(N, K, target, coins, dp);
    }
}