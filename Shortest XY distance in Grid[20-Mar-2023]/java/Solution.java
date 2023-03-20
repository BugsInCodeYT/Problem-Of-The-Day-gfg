//				>> JAVA CODE <<

class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
        
        
        int ans=Integer.MAX_VALUE;
        
        int[][] dp=new int[N][M];
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(grid.get(i).get(j)=='X') dp[i][j]=0;
                else dp[i][j]=Integer.MAX_VALUE;
            }
        }
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(grid.get(i).get(j)=='X') continue;
                
                int min=dp[i][j];
                if(i+1<N) min=Math.min(min,dp[i+1][j]);
                if(i-1>=0) min=Math.min(min,dp[i-1][j]);
                if(j-1>=0) min=Math.min(min,dp[i][j-1]);
                if(j+1<M) min=Math.min(min,dp[i][j+1]);
                
                if(min!=dp[i][j]) dp[i][j]=min+1;
            }
        }
        
        for(int i=N-1;i>=0;i--)
        {
            for(int j=M-1;j>=0;j--)
            {
                if(grid.get(i).get(j)=='X') continue;
                
                int min=dp[i][j];
                if(i+1<N) min=Math.min(min,dp[i+1][j]);
                if(i-1>=0) min=Math.min(min,dp[i-1][j]);
                if(j-1>=0) min=Math.min(min,dp[i][j-1]);
                if(j+1<M) min=Math.min(min,dp[i][j+1]);
                
                if(min!=dp[i][j]) dp[i][j]=min+1;
                
                if(grid.get(i).get(j)=='Y')
                  ans=Math.min(ans,dp[i][j]);
            }
        }         
                
            return ans;
    }
};
