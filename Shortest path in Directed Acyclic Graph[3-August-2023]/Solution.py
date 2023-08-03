#  >> PYTHON CODE <<

from typing import List
from collections import deque   

class Solution:


    def shortestPath(self,N, M, edges):
        adj = [[] for _ in range(N)]
    
        for i in range(M):
            u, v, w = edges[i]
            adj[u].append((v, w))
    
        q = deque()
        dist = [float('inf')] * N
    
        dist[0] = 0
        q.append((0, 0))
    
        while q:
            node, distance = q.popleft()
    
            for neighbor, ndistance in adj[node]:
                if distance + ndistance < dist[neighbor]:
                    dist[neighbor] = distance + ndistance
                    q.append((neighbor, dist[neighbor]))
    
        for i in range(N):
            if dist[i] == float('inf'):
                dist[i] = -1
    
        return dist