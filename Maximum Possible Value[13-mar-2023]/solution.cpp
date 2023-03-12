class Solution {
  public:
    long long maxPossibleValue(int N,vector<int> A, vector<int> B) {
        long len, cnt, ans = 0, sticks = 0;
        long min_val = LONG_MAX;

        for (int i = 0; i < N; i++) {
            len = A[i];
            cnt = B[i];

            if (cnt &1>0)
                cnt -= 1;
            if (cnt >= 2)
                min_val = min(len, min_val);

            ans += (len * cnt);
            sticks += cnt;
        }

        if (sticks % 4 != 0) {
            ans -= 2l * min_val;
        }

        return ans;
    }
};
