//    >> C++ CODE <<

bool wifiRange(int N, string S, int X){
        vector<int> visited(N, 0);
        for (int i = 0; i < N; i++) {
            if (S[i] == '1') {
                visited[max(i - X, 0)] += 1;
                if (i + X + 1 < N) {
                    visited[i + X + 1] += -1;
                }
            }
        }
        for (int i = 1; i < N; i++) {
            visited[i] += visited[i - 1];
        }
        for (int val : visited) {
            if (val == 0) {
                return false;
            }
        }
        return true;
        
    }