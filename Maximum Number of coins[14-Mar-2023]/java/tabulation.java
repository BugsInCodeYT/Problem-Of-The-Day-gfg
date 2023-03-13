int[][] dp;
    
    int maxCoins(int N, ArrayList<Integer> arr) {
		
		dp=new int[N+2][N+2];
		
		arr.add(0,1); arr.add(1);
		N=arr.size();
		for(int i=N-2;i>0;i--)
		{
		    for(int j=1;j<=N-2;j++){
		        
		        if(i<=j){
		            int max=Integer.MIN_VALUE;
		            for(int b=i;b<=j;b++)
		            {
		                int cost=arr.get(i-1)*arr.get(b)*arr.get(j+1)+dp[i][b-1]+dp[b+1][j];
		                max=Math.max(max,cost);
		            }
		            dp[i][j]=max;
		        }
		        else
		            dp[i][j]=0;
		    }
		}
		
		
		    return dp[1][N-2];
		
	}