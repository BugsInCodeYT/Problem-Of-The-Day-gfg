//   >> CPP CODE <<

class Solution {
public:
    int MAX;
    bool primes[1000001];
    Solution() {
        MAX = 1000001;
        memset(primes, true, sizeof(primes));
        primes[1] = false;

        for (int i = 2; i*i < MAX; i++) {
            if (primes[i]) {
                for (int j = i * 2; j < MAX; j += i) {
                    primes[j] = false;
                }
            }
        }
    }
    int minNumber(int arr[], int N) {
        int sum = 0;

        for (int i = 0; i < N; i++) sum += arr[i];

        int st = sum;

        while (primes[st] == false)
            st++;

        return st - sum;
    }
};