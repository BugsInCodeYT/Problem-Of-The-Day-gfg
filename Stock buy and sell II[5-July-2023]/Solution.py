#  >> PYTHON CODE <<

class Solution:
    def stockBuyAndSell(self, n : int, prices : List[int]) -> int:
        buy=-1
        profit=0
        
        for i in range(n):
            if(buy==-1):
                buy=prices[i]
                
            if i<n-1 and prices[i]>prices[i+1]:
                profit+=(prices[i]-buy)
                buy=-1
            elif buy!=-1 and i==n-1:
                profit+=(prices[i]-buy)
        
        return profit