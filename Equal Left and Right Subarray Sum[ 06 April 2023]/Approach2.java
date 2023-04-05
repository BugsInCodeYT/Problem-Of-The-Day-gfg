//	>> JAVA CODE <<


int equalSum(int [] A, int N) {
		
		if(N==1) return 1;
		
		int[] prefixSum=new int[N];
		prefixSum[0]=A[0];
		
		for(int i=1;i<A.length;i++)
		{
		    prefixSum[i]=prefixSum[i-1]+A[i];
		}
		
		for(int i=1;i<N;i++)
		{
		    if(prefixSum[i-1]==prefixSum[N-1]-prefixSum[i]) return i+1;
		}
		
		return -1;
	}
