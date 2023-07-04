class Solution{
  public:
    int countSubArrayProductLessThanK(const vector<int>& a, int n, long long k) {
        int i=0,j=0;
        long prod=1;
        int ans=0;
        while(j<n)
        {
            prod*=a[j];
            
            while(i<=j && prod>=k)
            {
                prod/=a[i];
                i++;
            }
            
            ans+=(j-i+1);
            j++;
        }
        
            return ans;
    }
};