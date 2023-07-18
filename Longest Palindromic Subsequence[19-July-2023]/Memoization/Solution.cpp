//  >> C++ CODE: MEMOIZATION <<

class Solution {
public:
    int longestPalinSubseq(string S) {
        vector<vector<int>> dp(S.length() + 1, vector<int>(S.length() + 1, -1));
        return solve(0, 0, S, string(S.rbegin(), S.rend()), dp);
    }

private:
    int solve(int i, int j, const string& A, const string& B, vector<vector<int>>& dp) {
        if (i == A.length() || j == B.length()) {
            dp[i][j] = 0;
            return dp[i][j];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (A[i] == B[j]) {
            dp[i][j] = 1 + solve(i + 1, j + 1, A, B, dp);
            return dp[i][j];
        }

        dp[i][j] = max(solve(i + 1, j, A, B, dp), solve(i, j + 1, A, B, dp));
        return dp[i][j];
    }
};
