#  >> PYTHON CODE <<

class Solution:
    #Function to return list containing first n fibonacci numbers.
    def printFibb(self,N):
        ans=[0]*N
        
        if(N==1):
            ans[0]=1
            return ans
        
        ans[0],ans[1]=1,1
        
        for i in range(2,N):
            ans[i]=ans[i-1]+ans[i-2]
            
        return ans