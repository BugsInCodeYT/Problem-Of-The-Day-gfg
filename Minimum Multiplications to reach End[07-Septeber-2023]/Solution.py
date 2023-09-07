#  >> PYTHON CODE <<

from typing import List

from collections import deque

class Solution:
    def minimumMultiplications(self, arr, start, end):
        level = 0
        queue = deque()
        visited = [False] * 100001
        
        queue.append(start)
        visited[start] = True
        
        while queue:
            size = len(queue)
            
            for i in range(size):
                current = queue.popleft()
                
                if current == end:
                    return level
                
                for number in arr:
                    newStart = (current * number) % 100000
                    if not visited[newStart]:
                        queue.append(newStart)
                        visited[newStart] = True
            
            level += 1
        
        return -1