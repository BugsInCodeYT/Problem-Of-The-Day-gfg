#   >> PYTHON CODE <<

import heapq

class Solution:
    
    def maxCombinations(self,N, K, A, B):
        A.sort()
        B.sort()
    
        ans = []
    
        pq = []
    
        for i in range(N):
            pq.append([-A[i] - B[N - 1], N - 1])
    
        heapq.heapify(pq)
    
        while pq and K > 0:
            current_sum, ind = heapq.heappop(pq)
            
            ans.append(-current_sum)
        
            if ind - 1 >= 0:
                heapq.heappush(pq, [current_sum + B[ind] - B[ind - 1], ind - 1])
        
            K -= 1
    
        return ans