int [] lexicographicallyLargest(int [] arr, int n) {
		
		int[] ans=new int[n];
		
		for(int i=0;i<arr.length;i++) ans[i]=arr[i];
		
		for(int i=0;i<n-1;i++)
	    {
	         if((arr[i]+arr[i+1])%2==0 && arr[i]<arr[i+1])
	         {
	             int temp=arr[i];
	             arr[i]=arr[i+1];
	             arr[i+1]=temp;
	         }
	    }
		
		if(Arrays.equals(arr,ans)) return ans;
		
		
		    return lexicographicallyLargest(arr,n);
		
	}