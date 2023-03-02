

//User function Template for Java

class Solution{
    static long gcd(long a,long b)
    {
        if(a<b) return gcd(b,a); 
        
        while(b!=0)
        {
            long temp=a;
            a=b;
            b=temp%b;
        }
        
            return a;
    }
    static List<Long> minimumSquares(long L, long B)
    {
        long K=gcd(L,B);
        long N=(long)(L*B)/(long)(K*K);
        
            return Arrays.asList(N,K);
    }
}