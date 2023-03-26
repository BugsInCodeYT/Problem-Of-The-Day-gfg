//			>> C++ Recursive <<  

int solve(int i, vector<int>& arr, int N, int K, int sum) {
        if (K == 0) {
            if (sum == N) {
                return 1;
            } else {
                return 0;
            }
        }
        if (i == arr.size()) {
            return 0;
        }
        
        return solve(i, arr, N, K-1, sum+arr[i]) + solve(i+1, arr, N, K, sum);
    }
    
    int countWaystoDivide(int N, int K) {
        vector<int> arr(N);
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        return solve(0, arr, N, K, 0);
    }