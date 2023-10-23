// >> CPP CODE <<

class Solution{
		
	public:
	int maxSumIS(int arr[], int n) {
        vector<int> dp(n);

        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
        }

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    max = max>dp[j]?max:dp[j];
                }
            }

            dp[i] += max;
        }

        return *max_element(dp.begin(), dp.end());
    }
};