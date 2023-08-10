//  >> CPP CODE <<

class Solution
{
    public:
    
    int lcs(int n, int m, string s1, string s2){
        vector<vector<int>>dp(n+1,vector<int>(m+1,-1));
        
        for(int i=n;i>=0;i--)
        {
            for(int j=m;j>=0;j--)
            {
                if(i==n or j==m) dp[i][j]=0;
                else if(s1[i]==s2[j])
                    dp[i][j]=1+dp[i+1][j+1];
                else
                    dp[i][j]=max(dp[i+1][j],dp[i][j+1]);
            }
        }
        
        return dp[0][0];
    }
};