class Solution{
    vector<vector<int>> dp;

    public:
        int solve(int i, vector<int>& arr, int j)
        {
            if(i > j) return 0;
            
            if(dp[i][j] != -1) return dp[i][j];
            
            int max_cost = INT_MIN;
            
            for(int b = i; b <= j; b++)
            {
                int cost = arr[b] * arr[i-1] * arr[j+1] + solve(b+1, arr, j) + solve(i, arr, b-1);
                max_cost = max(max_cost, cost);
            }
            
            return dp[i][j] = max_cost;
        }

        int maxCoins(int N, vector <int> &arr)
        {
              dp.resize(N+2, vector<int>(N+2, -1));
                arr.insert(arr.begin(), 1);
                arr.push_back(1);
                
                return solve(1, arr, N);
        }
};