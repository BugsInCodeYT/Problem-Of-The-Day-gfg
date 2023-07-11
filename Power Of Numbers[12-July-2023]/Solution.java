//   >> JAVA CODE <<

class Solution
{
        
    int mod=(int)1e9+7;
    long solve(int N,int R)
    {
        if(R==0) return 1L;
        if(R==1) return N;
        
        long ans=solve(N,R/2)%mod;
        
        if(R%2==0) return (ans*ans)%mod;
        else return ((ans*ans)%mod*N)%mod;
    }
    long power(int N,int R)
    {
        return solve(N,R)%mod;
    }

}