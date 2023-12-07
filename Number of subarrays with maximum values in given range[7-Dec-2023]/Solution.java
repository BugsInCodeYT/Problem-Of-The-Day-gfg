//         >>  java code <<

class Solution{
    
    static long getCountLessThanL(int[] a,int n,int L)
    {
        long count=0;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<L)
                count+=(i-j+1);
            else
                j=i+1;
        }
        
        return count;
    }
    static long getCountLessThanEqualR(int[] a,int n,int R)
    {
        long count=0;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=R)
                count+=(i-j+1);
            else
                j=i+1;
        }
        
        return count;
    }
    static long countSubarrays(int a[], int n, int L, int R)  
    { 
        long lessThanL=getCountLessThanL(a,n,L);
        long lessThanEqualR=getCountLessThanEqualR(a,n,R);
        
        return lessThanEqualR-lessThanL;
        
        
    } 
}