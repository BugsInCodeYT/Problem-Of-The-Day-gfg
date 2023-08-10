//  >> JAVA CODE <<

class Solution
{
    static int solve(int i,int j,String s1,String s2,int[][] dp)
    {
        if(i==s1.length() || j==s2.length())
            return dp[i][j]=0;
        
        if(dp[i][j]!=-1) return dp[i][j];
            
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]=1+solve(i+1,j+1,s1,s2,dp);
        }
        
            return dp[i][j]=Math.max(solve(i+1,j,s1,s2,dp),solve(i,j+1,s1,s2,dp));
    }
    static int lcs(int x, int y, String s1, String s2)
    {
        int[][] dp=new int[x+1][y+1];
        
        for(int i=0;i<=x;i++) Arrays.fill(dp[i],-1);
        return solve(0,0,s1,s2,dp);
    }
    
}