//   >> JAVA CODE <<

long[] maxMin(long[] prefixSum,int l,int h)
    {
        int low=l, high=h;
        long maxSum=Long.MAX_VALUE,minSum=0;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            long leftSum=prefixSum[mid]-((l-1)>=0?prefixSum[l-1]:0);
            long rightSum=prefixSum[h]-prefixSum[mid];
            
            if(Math.abs(rightSum-leftSum)<maxSum-minSum)
            {
                maxSum=Math.max(rightSum,leftSum);
                minSum=Math.min(leftSum,rightSum);
            }
            
            if(leftSum<rightSum) low=mid+1;
            else high=mid-1;
        }
        
            return new long[]{minSum,maxSum};
    }
    long minDifference(int N, int A[]) 
    { 
        long[] prefixSum=new long[N];
        
        prefixSum[0]=A[0];
        for(int i=1;i<N;i++)
        {
            prefixSum[i]=prefixSum[i-1]+A[i];
        }
        
        long ans=Long.MAX_VALUE;
        
        for(int i=1;i<N-2;i++)
        {
           long[] maxMinLeft=maxMin(prefixSum,0,i);
           long[] maxMinRight=maxMin(prefixSum,i+1,N-1);
           
           long value=Math.max(maxMinLeft[1],maxMinRight[1])-Math.min(maxMinLeft[0],maxMinRight[0]);
           ans=Math.min(ans,value);
        }
        
            return ans;
    }