//  >> CPP MEMOIZATION CODE <<

class Solution
{
    public:
    //Function to find the maximum money the thief can get.
    int solve(int i,int arr[],int n,int dp[])
    {
        if(i>=n) return 0;
        
        if(dp[i]!=-1) return dp[i];
        
        int op1=arr[i]+solve(i+2,arr,n,dp);
        int op2=solve(i+1,arr,n,dp);
        
        return dp[i]=max(op1,op2);
    }
    int FindMaxSum(int arr[], int n)
    {
        int dp[n];
        
        for(int i=0;i<n;i++) dp[i]=-1;
        
        return solve(0,arr,n,dp);
    }
};