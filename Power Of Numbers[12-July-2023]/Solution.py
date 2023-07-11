# >> PYTHON CODE <<

class Solution:
    #Complete this function
    def power(self,N,R):
        mod=int(1e9)+7
        def solve(N,R):
            if(R==0): return 1
            if(R==1): return N
            
            ans=solve(N,R//2)%mod
            
            if(R%2==0): return (ans*ans)%mod
            else: return ((ans*ans)%mod*N)%mod
        
        
        return solve(N,R)%mod