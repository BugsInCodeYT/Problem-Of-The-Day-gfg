#  >> PYTHON CODE <<

class Solution:
    def nthFibonacci(self, n : int) -> int:
        if(n==0): return 0;
        a,b=0,1
        n-=2
        
        mod=1e9+7
        
        while(n>=0):
            c=(a%mod+b%mod)%mod
            a=b
            b=c
            
            n-=1
        
        return int(b%mod)