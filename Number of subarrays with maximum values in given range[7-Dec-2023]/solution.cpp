//     >>   CPP CODE <<

class Solution{
    public:
    long getCount(int a[],int n,int X,bool includeEqual)
    {
        long count=0;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(includeEqual)
            {
                if(a[i]<=X) count+=(i-j+1);
                else j=i+1;
            }
            else
            {
                if(a[i]<X) count+=(i-j+1);
                else j=i+1;
            }
        }
        
        return count;
    }
    long countSubarrays(int a[], int n, int L, int R)
    {
        long lessThanL=getCount(a,n,L,false);
        long lessThanEqualR=getCount(a,n,R,true);
        
        return lessThanEqualR-lessThanL;
    }
};