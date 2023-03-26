
//        >> Memoization Java Code <<

class Solution {
    Integer[][][] dp;
    public int solve(int i,int[] arr,int N,int K,int sum)
    {
        if(sum>N) return 0;
        if(K==0)
        {
            if(sum==N)
                return dp[i][sum][K]=1;
            else
                return dp[i][sum][K]=0;
        }
        if(i==arr.length)
        {
            return dp[i][sum][K]=0;
        }
        
        if(dp[i][sum][K]!=null) return dp[i][sum][K];
        
        return dp[i][sum][K]=solve(i,arr,N,K-1,sum+arr[i])+solve(i+1,arr,N,K,sum);
        
    }
    public int countWaystoDivide(int N, int K) {
        
        dp=new Integer[N+1][N+1][K+1];
        int[] arr=new int[N];
        
        for(int i=0;i<N;i++) arr[i]=i+1;
        
        return solve(0,arr,N,K,0);
        
    }
}