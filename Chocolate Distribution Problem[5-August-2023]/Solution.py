#  >> PYTHON CODE <<

class Solution:

    def findMinDiff(self, A,N,M):
        A.sort()
        
        ans=1e9
        
        i=0
        
        while(i+M-1<N):
            ans=min(ans,A[i+M-1]-A[i])
            i+=1
            
        return ans