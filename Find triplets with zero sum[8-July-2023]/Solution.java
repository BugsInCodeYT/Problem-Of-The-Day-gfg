//  >> JAVA CODE <<

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        
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
}
