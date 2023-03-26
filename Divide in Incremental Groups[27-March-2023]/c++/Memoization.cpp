//		>> C++ Memoization Code <<

vector<vector<vector<int>>> dp;
    
    int solve(int i, vector<int>& arr, int N, int K, int sum) {
        if (sum > N) {
            return 0;
        }
        if (K == 0) {
            if (sum == N) {
                return dp[i][sum][K] = 1;
            } else {
                return dp[i][sum][K] = 0;
            }
        }
        if (i == arr.size()) {
            return dp[i][sum][K] = 0;
        }
        
        if (dp[i][sum][K] != -1) {
            return dp[i][sum][K];
        }
        
        return dp[i][sum][K] = solve(i, arr, N, K-1, sum+arr[i]) + solve(i+1, arr, N, K, sum);
    }
    
    int countWaystoDivide(int N, int K) {
        dp.resize(N+1, vector<vector<int>>(N+1, vector<int>(K+1, -1)));
        vector<int> arr(N);
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        return solve(0, arr, N, K, 0);
    }