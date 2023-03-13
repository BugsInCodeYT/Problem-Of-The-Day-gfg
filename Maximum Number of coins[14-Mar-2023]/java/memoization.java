

//User function Template for Java

class Solution{
    Integer[][] dp;
    int solve(int i,ArrayList<Integer> arr,int j)
    {
        if(i>j) return 0;
        
        if(dp[i][j]!=null) return dp[i][j];
        
        int max=Integer.MIN_VALUE;
        
        for(int b=i;b<=j;b++)
        {
            int cost=arr.get(b)*arr.get(i-1)*arr.get(j+1)+solve(b+1,arr,j)+solve(i,arr,b-1);
            max=Math.max(max,cost);
        }
        
            return dp[i][j]=max;
    }
    int maxCoins(int N, ArrayList<Integer> arr) {
		
		dp=new Integer[N+2][N+2];
		
		arr.add(0,1); arr.add(1);
		
		    return solve(1,arr,N);
		
	}
}