//  >> CPP CODE <<

class Solution {
public:
    bool check(int i, int sm, int target,int arr[], int N, vector<vector<int>>& dp) {
        if (sm == target) return true;
        if (i == N) return false;

        if (dp[i][sm] != -1) return dp[i][sm];

        if (sm + arr[i] > target) {
            dp[i][sm] = check(i + 1, sm, target, arr, N, dp);
            return dp[i][sm];
        }

        dp[i][sm] = check(i + 1, sm + arr[i], target, arr, N, dp) || check(i + 1, sm, target, arr, N, dp);
        return dp[i][sm];
    }

    bool equalPartition(int N,int arr[]) {
        int sm = 0;
        for (int i=0;i<N;i++) {
            sm += arr[i];
        }
        if (sm % 2 == 1) return false;

        int half = sm / 2;
        vector<vector<int>> dp(N, vector<int>(half + 1, -1));

        return check(0, 0, half, arr, N, dp);
    }
};