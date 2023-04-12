class Solution{
public:
    int findUsingBinarySearch(vector<int>& arr, int low, int high, int el) {
        int ans = high + 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= 5 * el) {
                ans = mid; high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    int dominantPairs(int n, vector<int>& arr) {
        sort(arr.begin(), arr.begin() + n/2);
        int ans = 0;
        for (int j = n/2; j < n; j++) {
            int i = findUsingBinarySearch(arr, 0, n/2 - 1, arr[j]);
            ans += (n/2 - i);
        }
        return ans;
    }
};