//  >> CPP CODE <<

class Solution
{
    public:
    //Function to find length of longest increasing subsequence.
    int lowerbound(vector<int> arr,int x)
    {
        int low=0,high=arr.size()-1;
        
        int ans=-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(arr[mid]>=x)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        
            return ans;
    }
    int longestSubsequence(int n, int a[])
    {
       vector<int> ans;
       
       ans.push_back(a[0]);
       
       for(int i=1;i<n;i++)
       {
           if(a[i]>ans.back())
           {
               ans.push_back(a[i]);
           }
           else
           {
               int low = lowerbound(ans,a[i]);
                ans[low]=a[i];
           }
           
           for(int x=0;x<ans.size();x++) cout<<ans[x]<<" ";
           cout<<endl;
           
       }
       
        
            return ans.size();
    }
};

