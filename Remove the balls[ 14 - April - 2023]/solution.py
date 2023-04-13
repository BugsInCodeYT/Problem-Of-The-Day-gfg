#     >> PYTHON CODE <<


from typing import List


class Solution:
    def finLength(self,N : int, color: List[int], radius: List[int]) -> int:
        class Pair:
            def __init__(self, color, radius):
                self.color = color
                self.radius = radius
            
        stack = []
    
        for i in range(N):
            if stack:
                if stack[-1].color == color[i] and stack[-1].radius == radius[i]:
                    stack.pop()
                else:
                    stack.append(Pair(color[i], radius[i]))
            else:
                stack.append(Pair(color[i], radius[i]))
    
        return len(stack) 