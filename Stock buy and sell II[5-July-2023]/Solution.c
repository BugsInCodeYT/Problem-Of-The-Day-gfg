//   >> C CODE <<

void stockBuySell(int price[], int N){
        int buy = -1;
        int profit = 0;
    
        for (int i = 0; i < N; i++) {
            if (buy == -1) {
                buy = price[i];
            }
    
            if (i < N - 1 && price[i] > price[i + 1]) {
                profit += (price[i] - buy);
                buy = -1;
            } else if (buy != -1 && i == N - 1) {
                profit += (price[i] - buy);
            }
        }
    
        printf("%d\n",profit);
}