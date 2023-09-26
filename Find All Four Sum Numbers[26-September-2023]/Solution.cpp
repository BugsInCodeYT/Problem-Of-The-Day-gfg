//  >> CPP CODE <<

class Solution{
    public:
    // arr[] : int input array of integers
    // k : the quadruple sum required
    vector<vector<int> > fourSum(vector<int> &arr, int k) {
        int n=arr.size();
        
        vector<vector<int>> ans;
        sort(arr.begin(), arr.end());
        
        for(int i=0;i<n-3;i++)
        {
            if(i>0 and arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n-2;j++)
            {
                if(j>i+1 and arr[j]==arr[j-1]) continue;
                int low=j+1,high=n-1;
                
                while(low<high)
                {
                    int sum=arr[i]+arr[j]+arr[low]+arr[high];
                    
                    if(sum==k)
                    {
                        ans.push_back({arr[i],arr[j],arr[low],arr[high]});
                        int a=arr[low],b=arr[high];
                        while(low<high and a==arr[low]) low++;
                        while(low<high and b==arr[high]) high--;
                    }
                    else if(sum<k) low++;
                    else high--;
                }
            }
        }
        
        return ans;
        
    }
};