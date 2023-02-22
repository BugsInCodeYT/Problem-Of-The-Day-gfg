
class Solution {
    static int mod=(int)1e9+7;
    static long[][] dp;
    static int uniquePaths(int n, int m, int[][] grid) {
        
        if(grid[0][0]==0 || grid[n-1][m-1]==0) return 0;
        
        dp=new long[n][m];
        
        dp[n-1][m-1]=1;
        
        for(int i=m-2;i>=0;i--)
        {
            if(grid[n-1][i]!=0)
                dp[n-1][i]=dp[n-1][i+1];
            else
                dp[n-1][i]=0L;
        }
        
        for(int i=n-2;i>=0;i--)
        {
            if(grid[i][m-1]!=0)
                dp[i][m-1]=dp[i+1][m-1];
            else
                dp[i][m-1]=0L;
        }
        
        for(int i=n-2;i>=0;i--)
        {
            for(int j=m-2;j>=0;j--)
            {
                if(grid[i][j]!=0)
                    dp[i][j]=(dp[i+1][j]%mod+dp[i][j+1]%mod)%mod;
                else
                    dp[i][j]=0L;
            }
        }
        
            return (int)dp[0][0]%mod;
    }
};