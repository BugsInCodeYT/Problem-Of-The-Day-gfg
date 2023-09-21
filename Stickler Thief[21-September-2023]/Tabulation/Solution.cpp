//  >> CPP TABULATION CODE <<

class Solution
{
    public:
    //Function to find the maximum money the thief can get.
    int FindMaxSum(int arr[], int n)
    {
        int dp[n+1];
        
        dp[n]=0;
        dp[n-1]=arr[n-1];
        
        for(int i=n-2;i>=0;i--)
        {
            dp[i]=max(arr[i]+dp[i+2],dp[i+1]);
        }
        
        return dp[0];
    }
};
