//  >> C++ CODE: TABULATION <<

class Solution{
  public:
    int longestPalinSubseq (string S)
    {
        int n = S.length ();
        string rev = S;
        reverse (rev.begin(), rev.end());
        
  
        int dp[n + 1][n + 1];
        for (int i = n; i >=0; i--)
        {
            for (int j = n; j >=0; j--)
            {
                if (i == n || j == n) dp[i][j] = 0;
                else
                {
                    if (S[i] == rev[j])
                        dp[i][j] = 1 + dp[i + 1][j + 1];
                    else
                        dp[i][j] = max (dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }
};
