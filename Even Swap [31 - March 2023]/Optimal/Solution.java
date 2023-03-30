//		>> JAVA CODE <<

void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
    void reverse(int[] a,int i,int j)
    {
        while(i<j)
        {
            j--;
            
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            
            
            i++;
        }
    }
	int [] lexicographicallyLargest(int [] a, int n) {
	
	    int i=0;
	    
	    while(i<n)
	    {
	        int j=i+1;
	        
	        while(j<n && (a[j]+a[j-1])%2==0)
	        {
	            j++;
	        }
	        
	        
	        Arrays.sort(a,i,j);
	        reverse(a,i,j);
	        
	        i=j;
	    }
	    
	        return a;
	}