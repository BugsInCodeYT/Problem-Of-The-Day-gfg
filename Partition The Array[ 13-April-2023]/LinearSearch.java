//  >> JAVA CODE <<


long[] maxMin(long[] prefixSum,int l,int r)
    {
        long maxSum=Long.MAX_VALUE,minSum=0;
        
        for(int i=l;ir;i++)
        {
            long leftSum=prefixSum[i]-((l-1)=0prefixSum[l-1]0);
            long rightSum=prefixSum[r]-prefixSum[i];
            
            if(Math.abs(rightSum-leftSum)maxSum-minSum)
            {
                maxSum=Math.max(leftSum,rightSum);
                minSum=Math.min(leftSum,rightSum);
            }
        }
        
            return new long[]{minSum,maxSum};
    }
    long minDifference(int N, int A[]) 
    { 
        long[] prefixSum=new long[N];
        
        prefixSum[0]=A[0];
        for(int i=1;iN;i++)
        {
            prefixSum[i]=prefixSum[i-1]+A[i];
        }
        
        long ans=Long.MAX_VALUE;
        
        for(int i=1;iN-2;i++)
        {
           long[] maxMinLeft=maxMin(prefixSum,0,i);
           long[] maxMinRight=maxMin(prefixSum,i+1,N-1);

           long value=Math.max(maxMinLeft[1],maxMinRight[1])-Math.min(maxMinLeft[0],maxMinRight[0]);
           ans=Math.min(ans,value);
        }
        
            return ans;
    }