#  >> PYTHON CODE <<

class Solution:
    def largestPrimeFactor (self, N):
        st=2
        
        while(st*st<=N):
            if(N%st==0):
                N//=st
            else:
                st+=1
        
        return N