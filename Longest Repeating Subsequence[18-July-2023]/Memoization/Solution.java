//  >> JAVA MEMOIZATION <<

class Solution
{
    private int solve(String str1,String str2,int i,int j,int n,int[][] dp){
        
        if(i==n || j==n)
            return dp[i][j]=0;
         
         if(dp[i][j]!=-1)
            return dp[i][j];
         
            
        if(i!=j && str1.charAt(i)==str2.charAt(j))
        {
            return dp[i][j]=1+solve(str1,str2,i+1,j+1,n,dp);
        }
        
        return dp[i][j]=Math.max(solve(str1,str2,i+1,j,n,dp),solve(str1,str2,i,j+1,n,dp));
    
    }
    public int LongestRepeatingSubsequence(String str)
    {
        int[][] dp=new int[str.length()+1][str.length()+1];
        
        for(int i=0;i<=str.length();i++)
            Arrays.fill(dp[i],-1);
        
        return solve(str,str,0,0,str.length(),dp);
        
    }
}