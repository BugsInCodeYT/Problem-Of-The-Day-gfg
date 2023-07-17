//  >> C++ CODE TABULATION <<

class Solution {
	public:
		int LongestRepeatingSubsequence(string str){
		    int n = str.length();
		 
		    int dp[n+1][n+1];
		 
		    for (int i=n; i>=0; i--)
		    {
		        for (int j=n; j>=0; j--)
		        {
		            if(i==n or j==n) dp[i][j]=0;
		            else if (str[i] == str[j] && i!=j)
		                dp[i][j] =  1 + dp[i+1][j+1];   
		            else
		                dp[i][j] = max(dp[i][j+1], dp[i+1][j]);
		        }
		    }
		    
		    return dp[0][0];
		}

};