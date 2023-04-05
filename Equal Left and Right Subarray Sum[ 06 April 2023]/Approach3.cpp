//		>> C++ CODE <<

		

		if(N==1) return 1;
		
		int sum=accumulate(A.begin(),A.end(),0);
		int preSum=0;
		
		for(int i=0;i<N;i++)
		{
		    if(preSum==sum-preSum-A[i]) return i+1;
		    
		    preSum+=A[i];
		}
		
		    return -1;