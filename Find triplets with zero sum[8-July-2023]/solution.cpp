//  >> C++ CODE <<

class Solution{
  public:
    //Function to find triplets with zero sum.
    bool findTriplets(int arr[], int n)
    { 
        sort(arr,arr+n);
        
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            int target=-arr[i];
            while(j<k)
            {
                if(arr[j]+arr[k]==target) return true;
                else if(arr[j]+arr[k]>target) k--;
                else j++;
            }
            
        }
        
            return false;
    }
};
