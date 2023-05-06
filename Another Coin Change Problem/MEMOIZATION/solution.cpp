//  >> C++: MEMOIZATION <<
class Solution {
  public:
    bool solve(int N, int K, int target, vector<int> &coins, vector<vector<int>> &dp) {
            
        if (K == 0 and target == 0) return true;
        
        if (dp[K][target] != -1) return dp[K][target];
        bool ans = false;
        for (int i = 0; i < N; i++) {
            if(target>=coins[i] and K-1>=0)
                ans |= solve(N, K - 1, target - coins[i], coins, dp);
        }
        
        return dp[K][target] = ans;
        
    }
    bool makeChanges(int N, int K, int target, vector<int> &coins) {
        vector<vector<int>> dp(K+1, vector<int>(target+1, -1));
        return solve(N, K, target, coins, dp);
    }
};
