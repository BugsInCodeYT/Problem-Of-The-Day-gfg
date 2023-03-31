int [] lexicographicallyLargest(int [] arr, int n) {
		
		boolean swap=false;
		
		for(int i=0;i<n-1;i++)
	    {
	         if((arr[i]+arr[i+1])%2==0 && arr[i]<arr[i+1])
	         {
	             int temp=arr[i];
	             arr[i]=arr[i+1];
	             arr[i+1]=temp;
			 
			 swap=true;
	         }
	    }
		
		if(!swap) return arr;
		
		
		    return lexicographicallyLargest(arr,n);
		
	}
