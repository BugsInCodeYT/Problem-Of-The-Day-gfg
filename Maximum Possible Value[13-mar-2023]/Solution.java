class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
        
        long len,cnt,min=Long.MAX_VALUE;
        
        long ans=0,sticks=0;
        
        for(int i=0;i<N;i++)
        {
            len=A[i]; cnt=B[i];
            
            
            if(cnt&1>0) cnt-=1;
            if(cnt>=2) min=Math.min(len,min);
            
            ans+=(len*cnt);
            sticks+=cnt;
        }
        
        if(sticks%4!=0)
        {
            ans-=2l*min;
        }
        
            return ans;
    }
} 