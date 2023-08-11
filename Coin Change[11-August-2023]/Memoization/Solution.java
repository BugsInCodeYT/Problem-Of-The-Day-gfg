// >> JAVA CODE <<


class Solution {
    public long solve(int i,int curSum,int[] coins,int reqsum,long[][] dp)
    {
        if(curSum==reqsum) return 1;
        if(i==coins.length) return 0;

        if(dp[i][curSum]!=-1) return dp[i][curSum];

        if(curSum+coins[i]<=reqsum)
            return dp[i][curSum]=solve(i,curSum+coins[i],coins,reqsum,dp) + solve(i+1,curSum,coins,reqsum,dp);
        
        return dp[i][curSum]=solve(i+1,curSum,coins,reqsum,dp);
    }
    public long count(int coins[], int N, int sum) {
        long[][] dp=new long[N][sum];
        
        for(int i=0;i<N;i++) Arrays.fill(dp[i],-1);
        
        return solve(0,0,coins,sum,dp);
    }
}