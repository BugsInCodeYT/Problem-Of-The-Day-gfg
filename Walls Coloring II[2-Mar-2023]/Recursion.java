
class Solution{
    int solve(int cur,int[][] costs,int prev)
    {
        if(cur==costs.length) return 0;
        
        int min=Integer.MAX_VALUE/2;
        
        for(int i=0;i<costs[0].length;i++)
        {
            if(prev==-1)
            {
                min=Math.min(min,costs[cur][i]+solve(cur+1,costs,i));
            }
            else if(i!=prev)
            {
                min=Math.min(min,costs[cur][i]+solve(cur+1,costs,i));
            }
        }
        
        return min;
    }
	int minCost(int [][] costs) {
		
	    int ans=solve(0,costs,-1);
		
		if(ans>=Integer.MAX_VALUE/2) return -1;
		    return ans;
	}
}
class Solution{
    int solve(int cur,int[][] costs,int prev)
    {
        if(cur==costs.length) return 0;
        
        int min=Integer.MAX_VALUE/2;
        
        for(int i=0;i<costs[0].length;i++)
        {
            if(prev==-1)
            {
                min=Math.min(min,costs[cur][i]+solve(cur+1,costs,i));
            }
            else if(i!=prev)
            {
                min=Math.min(min,costs[cur][i]+solve(cur+1,costs,i));
            }
        }
        
        return min;
    }
	int minCost(int [][] costs) {
		
	    int ans=solve(0,costs,-1);
		
		if(ans>=Integer.MAX_VALUE/2) return -1;
		    return ans;
	}
}