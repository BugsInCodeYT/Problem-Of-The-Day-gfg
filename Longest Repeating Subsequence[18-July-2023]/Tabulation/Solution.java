//  >> JAVA CODE TABULATION<<

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int n=str.length();
        int[][] dp=new int[n+1][n+1];
        
        for(int i=n;i>=0;i--)
        {
            for(int j=n;j>=0;j--)
            {
                if(i==n || j==n) dp[i][j]=0;
                else if(i!=j && str.charAt(i)==str.charAt(j))
                    dp[i][j]=1+dp[i+1][j+1];
                else
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
        

            return dp[0][0];
            
    }
}