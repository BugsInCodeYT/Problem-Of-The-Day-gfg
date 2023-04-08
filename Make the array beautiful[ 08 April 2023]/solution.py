#    >> PYTHON CODE <<

from typing import List

class Solution:
    def makeBeautiful(self, arr: List[int]) -> List[int]:
        stack=[]
        
        for i in arr:
            if len(stack) is not 0 and ((stack[-1]>=0 and i<0) or (stack[-1]<0 and i>=0)):
                stack.pop()
            else:
                stack.append(i)
        
        return stack