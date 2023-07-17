//  >> C++ CODE MEMOIZATION <<

class Solution {
public:
    int solve(int i, int j, string& s1, string& s2, vector<vector<int>>& dp)
    {
        //base case
        if(i==s1.length() or j==s2.length())
        return 0;
        
        //memo check - is ans already calculated
        if(dp[i][j]!=-1)
        return dp[i][j];
        
        //recursive calls
        //small calculation
        if(s1[i]==s2[j] and i!=j)
        return dp[i][j]=1+solve(i+1, j+1, s1, s2, dp);
        
        int a=solve(i+1, j, s1, s2, dp);
        int b=solve(i, j+1, s1, s2, dp);
        
        return dp[i][j]=max(a,b);
    }
	int LongestRepeatingSubsequence(string str){
	    int n=str.length();
	    vector<vector<int>> dp(n+1,vector<int>(n+1,-1));
        return solve(0,0,str,str,dp);
	}

};