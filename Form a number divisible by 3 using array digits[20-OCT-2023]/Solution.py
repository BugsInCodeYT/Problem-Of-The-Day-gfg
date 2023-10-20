#   >> PYTHON CODE <<

class Solution:
    def isPossible(self, N, arr):
        sum=0
        
        for i in range(N):
            sum+=arr[i]
            
        if(sum%3==0): return 1
        
        return 0
