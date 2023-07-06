//   >> C++ CODE <<

class Solution
{
    public:
    //Function to sort an array using quick sort algorithm.
    void quickSort(int arr[], int low, int high)
    {
        if(low>=high) return;
        
        int par=partition(arr,low,high);
        
        quickSort(arr,low,par-1);
        quickSort(arr,par+1,high);
    }
    
    public:
    int partition (int arr[], int low, int high)
    {
       int pivot=arr[high];
        int x=low-1;
        
        for(int i=low;i<high;i++)
        {
            if(arr[i]<=pivot)
            {
                x++;
                
                int temp=arr[i];
                arr[i]=arr[x];
                arr[x]=temp;
            }
        }
        
        int temp=arr[high];
        arr[high]=arr[x+1];
        arr[x+1]=temp;
        
        return x+1;
    }
};