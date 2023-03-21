//			>> C++ CODE <<


class Solution {
public:
    long long recUtil(int X, int Y, string S) {
        if (S.length() == 0) {
            return 0;
        }

        long long max_val = 0;

        for (int i = 0; i < S.length() - 1; i++) {
            if (S[i] == 'r' && S[i + 1] == 'p') {
                string str = S.substr(0, i) + S.substr(i + 2, S.length());
                max_val = max(max_val, Y + recUtil(X, Y, str));
            }
            else if (S[i] == 'p' && S[i + 1] == 'r') {
                string str = S.substr(0, i) + S.substr(i + 2, S.length());
                max_val = max(max_val, X + recUtil(X, Y, str));
            }
        }

        return max_val;
    }

    long long solve(int X, int Y, string S) {
        return recUtil(X, Y, S);
    }
};