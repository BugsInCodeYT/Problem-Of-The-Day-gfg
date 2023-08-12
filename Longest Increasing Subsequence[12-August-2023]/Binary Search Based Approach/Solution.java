// >> JAVA CODE <<

class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int lowerbound(int[] arr,int size,int x)
    {
        int low=0,high=size-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        
            return ans;
    }
    static int longestSubsequence(int size, int a[])
    {
        int[] ans=new int[size];
        int sz=0;
        ans[sz++]=a[0];
        
        for(int i=1;i<size;i++)
        {
            if(ans[sz-1]<a[i])
            {
                ans[sz++]=a[i];
            }
            else
            {
                int index=lowerbound(ans,sz,a[i]);
                
                ans[index]=a[i];
            }
        }
        
            return sz;
    }
}