//  >> JAVA CODE <<

class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        int buy = -1;
        int profit = 0;
    
        for (int i = 0; i < n; i++) {
            if (buy == -1) {
                buy = prices[i];
            }
    
            if (i < n - 1 && prices[i] > prices[i + 1]) {
                profit += (prices[i] - buy);
                buy = -1;
            } else if (buy != -1 && i == n - 1) {
                profit += (prices[i] - buy);
            }
        }
    
        return profit;

    }
}