//  >> JAVA MEMOIZATION CODE CODE <<


class Solution
{
    //Function to find the maximum money the thief can get.
    public int solve(int i,int arr[],int n,int[] dp)
    {
        if(i>=n) return 0;
     
           if(dp[i]!=-1) return dp[i];
        
        int op1=arr[i]+solve(i+2,arr,n,dp);
        int op2=solve(i+1,arr,n,dp);
        
        return dp[i]=Math.max(op1,op2);
    }
    public int FindMaxSum(int arr[], int n)
    {
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        
        return solve(0,arr,n,dp);
    }
}