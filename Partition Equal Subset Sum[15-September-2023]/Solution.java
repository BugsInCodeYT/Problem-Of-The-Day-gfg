//  >> JAVA CODE <<

class Solution{
    static boolean check(int i,int sm,long target,int[] arr,int N,Boolean[][] dp)
    {
        if(sm==target) return true;
        if(i==N) return false;
        
        if(dp[i][sm]!=null) return dp[i][sm];
        
        if(sm+arr[i]>target)
            return dp[i][sm]=check(i+1,sm,target,arr,N,dp);
            
        return dp[i][sm]=check(i+1,sm,target,arr,N,dp) || check(i+1,sm+arr[i],target,arr,N,dp);
    }
    static int equalPartition(int N, int arr[])
    {
        long sum=0;
        
        for(int i=0;i<N;i++) sum+=arr[i];
        
        if(sum%2==1) return 0;
        
        long half=sum/2;
        
        Boolean[][] dp=new Boolean[N][(int)(sum)];
        
        return check(0,0,half,arr,N,dp)?1:0;
    }
}