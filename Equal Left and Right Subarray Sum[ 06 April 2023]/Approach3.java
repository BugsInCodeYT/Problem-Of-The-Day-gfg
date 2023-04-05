//		>> JAVA CODE <<             
            

            if(N==1) return 1;
		
		int sum=Arrays.stream(A).sum();
		int preSum=0;
		
		for(int i=0;i<N;i++)
		{
		   // System.out.println(preSum+" "+(sum-preSum-A[i]));
		    if(preSum==sum-preSum-A[i]) return i+1;
		    
		    preSum+=A[i];
		}
		
		    return -1;