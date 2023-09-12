#  >> PYTHON CODE <<

import math

class Solution:
    def isPerfectNumber(self, N):
        
        if(N==1): return 0
        
        sum=1
        
        for i in range(2,int(math.sqrt(N))+1):
            if(N%i==0):
                if(N/i!=i):
                    sum+=i+N//i
                else:
                    sum+=i
        
        return 1 if sum==N else 0
