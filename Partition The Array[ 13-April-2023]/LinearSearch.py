# >> LINEAR SEARCH <<


import sys
from typing import List,Tuple
class Solution:
    
    def minDifference(self,N,A):
        def maxMin(prefixSum: List[int], l: int, r: int) -> Tuple[int, int]:
            maxSum, minSum = sys.maxsize, 0
            for i in range(l, r):
                leftSum = prefixSum[i] - (prefixSum[l - 1] if l - 1 >= 0 else 0)
                rightSum = prefixSum[r] - prefixSum[i]
                if abs(rightSum - leftSum) < maxSum - minSum:
                    maxSum = max(leftSum, rightSum)
                    minSum = min(leftSum, rightSum)
            return (minSum, maxSum)
    
    
        prefixSum = [0] * N
        prefixSum[0] = A[0]
        for i in range(1, N):
            prefixSum[i] = prefixSum[i - 1] + A[i]
        ans = sys.maxsize
        for i in range(1, N - 2):
            maxMinLeft = maxMin(prefixSum, 0, i)
            maxMinRight = maxMin(prefixSum, i + 1, N - 1)
            value = max(maxMinLeft[1], maxMinRight[1]) - min(maxMinLeft[0], maxMinRight[0])
            ans = min(ans, value)
        
        return ans
    