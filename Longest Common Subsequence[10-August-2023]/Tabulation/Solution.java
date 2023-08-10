// >> JAVA CODE <<

class Solution
{
    
    static int lcs(int x, int y, String s1, String s2)
    {
        int[][] dp=new int[x+1][y+1];
        
        for(int i=x;i>=0;i--)
        {
            for(int j=y;j>=0;j--)
            {
                if(i==x || j==y) dp[i][j]=0;
                else if(s1.charAt(i)==s2.charAt(j)) dp[i][j]=1+dp[i+1][j+1];
                else dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
        
            return dp[0][0];
    }
    
}