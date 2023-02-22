class Solution {
    static int mod=(int)1e9+7;
    static Long[][] dp;
    static long solve(int i,int j,int n,int m,int[][] grid)
    {
        if(i>=n || j>=m || grid[i][j]==0) return 0L;
        if(i==n-1 && j==m-1) return 1L;
        
        if(dp[i][j]!=null) return dp[i][j];
        
        return dp[i][j]=(solve(i+1,j,n,m,grid)%mod + solve(i,j+1,n,m,grid)%mod)%mod;
    }
    static int uniquePaths(int n, int m, int[][] grid) {
        
        dp=new Long[n][m];
        
        
        return (int)solve(0,0,n,m,grid)%mod;
        
    }
};