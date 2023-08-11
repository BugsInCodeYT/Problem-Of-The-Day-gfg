//  >> JAVA CODE <<

class Solution {
    public long count(int coins[], int N, int sum) {
        long[][] dp=new long[N+1][sum+1];
        
        for(int i=N;i>=0;i--)
        {
            for(int j=sum;j>=0;j--)
            {
                if(i==N) dp[i][j]=0;
                else if(j==sum) dp[i][j]=1;
                else
                {
                    if(j+coins[i]>sum)
                    {
                        dp[i][j]=(i+1<=N)?dp[i+1][j]:0;
                    }
                    else
                    {
                        dp[i][j]=(i+1<=N?dp[i+1][j]:0) + (dp[i][j+coins[i]]);
                    }
                }
            }
        }
        
            return dp[0][0];
    }
}