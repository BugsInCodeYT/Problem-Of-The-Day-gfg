//  >> C++ CODE <<

class Solution
{
    public:
    void heapify(int arr[], int n, int i)  
    { 
        int l=i*2+1;
    	int r=i*2+2;
    	int largest=i;
    	
    	
    	if(l<n && arr[largest]<arr[l])
    		largest=l;
    	if(r<n && arr[largest]<arr[r])
    		largest=r;
    	
    	
    	if(largest!=i)
    	{
    		int temp=arr[i];
    		arr[i]=arr[largest];
    		arr[largest]=temp;
    		
    		heapify(arr,n,largest); 
    	}
    }

    public:
    void buildHeap(int arr[], int n)  
    { 
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }

    
    public:
    void heapSort(int arr[], int n)
    {
        buildHeap(arr,n);
        
        for(int i=n-1;i>0;i--)
        {
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            
            heapify(arr,i,0);
        }
    }
};