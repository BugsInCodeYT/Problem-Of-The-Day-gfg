class Solution{
    Integer[][] dp;
    int solve(int cur,int[][] costs,int prev)
    {
        if(cur==costs.length) return 0;
    
        if(prev!=-1 && dp[cur][prev]!=null) return dp[cur][prev];
        
        int min=Integer.MAX_VALUE/2;
    
        for(int i=0;i<costs[0].length;i++)
        {
            if(prev==-1)
            {
                min=Math.min(min,costs[cur][i]+solve(cur+1,costs,i));
            }
            else if(i!=prev)
            {
                int val=dp[cur+1][i]!=null?dp[cur+1][i]:solve(cur+1,costs,i);
                min=Math.min(min,costs[cur][i]+val);
            }
        }
        
        if(prev!=-1) dp[cur][prev]=min;
        
        return min;
    }
	int minCost(int [][] costs) {
		
		dp=new Integer[costs.length+1][costs[0].length+1];
		
	    int ans=solve(0,costs,-1);
		
		if(ans>=Integer.MAX_VALUE/2) return -1;
		
		
		    return ans;
		 
	}
}