//	>> C++ CODE <<

    
        if(N==1) return 1;
		
		int prefixSum[N];
		int suffixSum[N];
		prefixSum[0]=A[0];
		suffixSum[N-1]=A[N-1];
		
		
		for(int i=1;i<N;i++)
		{
		    prefixSum[i]=prefixSum[i-1]+A[i];
		}
		for(int i=N-2;i>=0;i--)
		{
		    suffixSum[i]=suffixSum[i+1]+A[i];
		}
		
		
		for(int i=1;i<N-1;i++)
		{
		    if(prefixSum[i-1]==suffixSum[i+1]) return i+1;
		}
		
		return -1;

        