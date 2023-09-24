//     >> CPP CODE <<

class Solution{
  public:
    vector<int> duplicates(int arr[], int n) {
        vector<int> ans;
        int base=n;
        for(int i=0;i<n;i++)
        {
            int num=arr[i]%base;
            
            arr[num]=arr[num]+base;
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]/base>1) ans.push_back(i);
        }
        
        if(ans.size()==0) ans.push_back(-1);

        
        return ans;
    }
};