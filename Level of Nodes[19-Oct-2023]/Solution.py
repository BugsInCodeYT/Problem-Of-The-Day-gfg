#   >> PYTHON CODE <<

from collections import deque

class Solution:
    
    def nodeLevel(self, V, adj, X):
        level = 0
        q = deque()
        visited = [False] * V

        q.append(0)

        while q:
            size = len(q)

            for _ in range(size):
                nn = q.popleft()
                visited[nn] = True

                if nn == X:
                    return level

                for neighbor in adj[nn]:
                    if not visited[neighbor]:
                        q.append(neighbor)

            level += 1

        return -1  
  