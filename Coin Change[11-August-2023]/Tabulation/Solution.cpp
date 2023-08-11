//  >> C++ CODE <<

class Solution {
  public:
    long long int count(int coins[], int N, int sum) {

        vector<vector<long long int>> dp(N + 1, vector<long long int>(sum + 1, 0));

        for (int i = N; i >= 0; i--) {
            for (int j = sum; j >= 0; j--) {
                if (j == sum) dp[i][j] = 1;
                else if (i == N) dp[i][j] = 0;
                else {
                    if (j + coins[i] > sum) {
                        dp[i][j] = (i + 1 <= N) ? dp[i + 1][j] : 0;
                    } else {
                        dp[i][j] = dp[i][j + coins[i]] + ((i + 1 <= N) ? dp[i + 1][j] : 0);
                    }
                }
            }
        }

        return dp[0][0];

    }
};