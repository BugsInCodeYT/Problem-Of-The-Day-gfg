
class Solution {
    static int mod=(int)1e9+7;
    static long solve(int i,int j,int n,int m,int[][] grid)
    {
        if(i>=n || j>=m || grid[i][j]==0) return 0L;
        if(i==n-1 && j==m-1) return 1L;
        
        return solve(i+1,j,n,m,grid) + solve(i,j+1,n,m,grid);
    }
    static int uniquePaths(int n, int m, int[][] grid) {
        
        return (int)solve(0,0,n,m,grid)%mod;
        
    }
};