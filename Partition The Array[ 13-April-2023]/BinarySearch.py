//  >> PYTHON CODE

from itertools import accumulate

class Solution:

    def minDifference(self, N, A):
        def maxMin(prefixSum, L, R):
            LSUM = (prefixSum[L-1] if L > 0 else 0)
            tot = prefixSum[R] - LSUM
            goal = tot//2
            while L<R:
                m = (L+R)//2
                if prefixSum[m] - LSUM < goal: L=m+1
                else: R=m
            v1, v2 = prefixSum[L]-LSUM, tot-(prefixSum[L]-LSUM)
            if L>0:
                v3, v4 = prefixSum[L-1]-LSUM, tot-(prefixSum[L-1]-LSUM)
                if abs(v2-v1) > abs(v4-v3): return (v3,v4)
            return (v1,v2) 
        
        
        prefixSum = list(accumulate(A))
        ans = 10**9

        for i in range(1, N - 2):
            maxMinLeft = maxMin(prefixSum, 0, i)
            maxMinRight = maxMin(prefixSum, i + 1, N - 1)
            value = max(maxMinLeft[1], maxMinRight[1],maxMinLeft[0],maxMinRight[0]) - min(maxMinLeft[0], maxMinRight[0],maxMinLeft[1],maxMinRight[1])
            ans = min(ans, value)

        return ans