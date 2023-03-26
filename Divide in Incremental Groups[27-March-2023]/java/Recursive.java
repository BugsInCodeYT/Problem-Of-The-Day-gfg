//		>> Java Recursive Code <<

class Solution {
    public int solve(int i,int[] arr,int N,int K,int sum)
    {
        if(K==0)
        {
            if(sum==N)
                return 1;
            else
                return 0;
        }
        if(i==arr.length)
        {
            return 0;
        }
        
        return solve(i,arr,N,K-1,sum+arr[i])+solve(i+1,arr,N,K,sum);
        
    }
    public int countWaystoDivide(int N, int K) {
        
        int[] arr=new int[N];
        
        for(int i=0;i<N;i++) arr[i]=i+1;
        
        return solve(0,arr,N,K,0);
        
    }
}