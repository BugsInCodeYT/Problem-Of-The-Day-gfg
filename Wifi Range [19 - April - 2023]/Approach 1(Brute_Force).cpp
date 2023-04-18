//   >> C++ CODE <<

bool wifiRange(int N, string S, int X){
        
        vector<bool> visited(N, false);
        for (int i = 0; i < N; i++) {
            if (S[i] == '1') {
                for (int j = max(0, i - X); j <= min(i + X, N - 1); j++) {
                    visited[j] = true;
                }
            }
        }
        for (bool val : visited) {
            if (val == false) {
                return false;
            }
        }
        return true;

        
    }