// >> C++ CODE <<


bool wifiRange(int N, string S, int X){
        int st = 0;
        while (st < N && S[st] != '1') {
            st += 1;
        }
        if (st == N || st > X) {
            return false;
        }
        int last = st;
        for (int i = st; i < N; i++) {
            if (i - last + 1 > 2 * (X + 1)) {
                //cout << last << " and " << i << endl;
                return false;
            }
            if (S[i] == '1') {
                last = i;
            }
        }
        if (N - last > X + 1) {
            return false;
        }
        return true;
    }