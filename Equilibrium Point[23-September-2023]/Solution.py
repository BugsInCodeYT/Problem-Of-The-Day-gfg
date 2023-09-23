#  >> PYTHON CODE <<

class Solution:
    # Complete this function
    
    #Function to find equilibrium point in the array.
    def equilibriumPoint(self,A, N):
        sumArray=sum(A);
        
        ss=0
        
        for i in range(N):
            if(ss==sumArray-ss-A[i]): return i+1;
            
            ss+=A[i]
        
        return -1
