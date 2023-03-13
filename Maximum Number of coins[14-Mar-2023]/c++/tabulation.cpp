class Solution{
    vector<vector<int>> dp;

    public:
        int maxCoins(int N, vector <int> &arr)
        {
            dp.resize(N+2, vector<int>(N+2));
            
            arr.insert(arr.begin(), 1);
            arr.push_back(1);
            N = arr.size();
        
            for(int i = N-2; i > 0; i--) {
                for(int j = 1; j <= N-2; j++) {
                    if(i <= j) {
                        int max_cost = INT_MIN;
                        for(int b = i; b <= j; b++) {
                            int cost = arr[i-1] * arr[b] * arr[j+1] + dp[i][b-1] + dp[b+1][j];
                            max_cost = max(max_cost, cost);
                        }
                        dp[i][j] = max_cost;
                    }
                    else
                        dp[i][j] = 0;
                }
            }
            
            return dp[1][N-2];
        }

};