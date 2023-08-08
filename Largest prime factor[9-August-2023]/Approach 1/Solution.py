#  >> PYTHON CODE <<

import math

class Solution:
    def largestPrimeFactor (self, N):
        def prime(n):
            if(n==2): return True
            for i in range(2,int(math.sqrt(n))+1):
                if(n%i==0): return False
            
            return True
        
        if(prime(N)): return N
        
        ans=-1
        for i in range(2,int(math.sqrt(N))+1):
            if(N%i==0):
                if(prime(i)): ans=max(ans,i)
                if(prime(N/i)): ans=max(ans,N/i)
        
        return int(ans)