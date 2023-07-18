//  >> JAVA CODE: MEMOIZATION <<

class Solution
{
    public int longestPalinSubseq(String S) {
        int[][] dp = new int[S.length() + 1][S.length() + 1];
        
        for(int i=0;i<=S.length();i++) Arrays.fill(dp[i],-1);
        
        return solve(0, 0, S, new StringBuilder(S).reverse().toString(), dp);
    }

    private int solve(int i, int j, String A, String B, int[][] dp) {
        if (i == A.length() || j == B.length()) {
            dp[i][j] = 0;
            return dp[i][j];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (A.charAt(i) == B.charAt(j)) {
            dp[i][j] = 1 + solve(i + 1, j + 1, A, B, dp);
            return dp[i][j];
        }

        dp[i][j] = Math.max(solve(i + 1, j, A, B, dp), solve(i, j + 1, A, B, dp));
        return dp[i][j];
    }

}