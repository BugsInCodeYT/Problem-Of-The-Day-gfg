//  >> JAVA CODE <<

class Solution{
    static boolean prime(int n)
    {
        if(n==2) return true;
        
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        
            return true;
    }
    static long largestPrimeFactor(int N) {
        
        if(prime(N)) return N;
        
        long ans=-1;
        
        for(int i=2;i<=Math.sqrt(N);i++)
        {
            if(N%i==0)
            {
                if(prime(i)) ans=Math.max(ans,i);
                if(prime(N/i)) ans=Math.max(ans,N/i);
            }
        }
        
            return ans;
        
    }
}