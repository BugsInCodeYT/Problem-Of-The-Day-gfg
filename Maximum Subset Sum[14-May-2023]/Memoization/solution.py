#  >> PYTHON MEMO <<
''' [This code will not work because there's a recursion limit in python,]
Even if you increase the limit still the code will show SIGSEGV '''
from typing import List
import sys

sys.setrecursionlimit(180000)

class Solution:
    def solve(self, i: int, prevTaken: int, arr: List[int], dp: List[List[int]]) -> int:
        if i >= len(arr):
            return 0
        
        if dp[i][prevTaken] is not None:
            return dp[i][prevTaken]
        
        if prevTaken == 0:
            dp[i][prevTaken] = self.solve(i+1, 1, arr, dp) + arr[i]
        else:
            dp[i][prevTaken] = max(self.solve(i+1, 1, arr, dp) + arr[i], self.solve(i+1, 0, arr, dp))
        
        return dp[i][prevTaken]
    
    def findMaxSubsetSum(self, N: int, A: List[int]) -> int:
        dp = [[None]*2 for _ in range(N)]
        
        return self.solve(0, 1, A, dp)
