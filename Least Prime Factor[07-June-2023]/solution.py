#  >> PYTHON CODE <<

class Solution:
    def leastPrimeFactor (self, n):
        primes=[-1]*(n+1)
        
        primes[0]=0
        primes[1]=1
        
        i=2
        while(i<=n):
            j=i
            while(j<=n):
                if(primes[j]==-1):
                    primes[j]=i
                
                j+=i
            
            i+=1

        return primes