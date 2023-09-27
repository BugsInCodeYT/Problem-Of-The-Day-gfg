//  >> CPP CODE <<

class Solution{
  public:
    vector<int> printClosest(int arr[], int brr[], int n, int m, int x) {
        vector<int> values(2,0);
        int i=0;
        int j=m-1;
        int ans=INT_MAX;
        int sum=arr[0]+brr[m-1];
        while(i<n && j>=0)
        {
            sum=arr[i]+brr[j];
            if(ans>abs(sum-x))
            {
                ans=abs(sum-x);
                values[0]=arr[i];
                values[1]=brr[j];
            }
            
            if(sum<=x)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return values;
    }
};