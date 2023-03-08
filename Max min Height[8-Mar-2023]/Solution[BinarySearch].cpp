
class Solution
{
    public:
        bool isvalid(vector <int> &a,int n,int k,int w,long long int mid)
        {
            long long int heights[n];
            fill(heights,heights+n,0ll);
            long long int days=0;
            
            for(long long int i=0;i<n;i++)
            {
                if(i-1>=0)
                    heights[i]+=heights[i-1];
                if(a[i]+heights[i]<mid)
                {
                    long long int diff=mid-a[i]-heights[i];
                    days+=diff;
                    heights[i]+=diff;
                    if(i+w<n)
                        heights[i+w]-=diff;
                }
            }
            
            return (days<=k);
        }
        long long int maximizeMinHeight(int n,int k,int w,vector <int> &a)
        {
            int ans=0;
            long long int min=0,max=1e10;
            while(min<=max)
            {
                long long int mid=(min+max)/2;
                if(isvalid(a,n,k,w,mid))
                {
                    min=mid+1;
                    ans=mid;
                }
                else
                {
                    max=mid-1;
                }
            }
            return ans;
        }
};