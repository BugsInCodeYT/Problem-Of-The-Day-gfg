#  >> PYTHON CODE <<

from typing import List

import heapq
    
class Solution:

    def shortestPath(self,N, M, edges):
        adj = [[] for _ in range(N)]
        
        for i in range(M):
            u, v, w = edges[i]
            adj[u].append((v, w))
        
        pq = []
        dist = [float('inf')] * N
        dist[0] = 0
        
        heapq.heappush(pq, (0, 0))
        
        while pq:
            distance, node = heapq.heappop(pq)
            
            if distance > dist[node]:
                continue
            
            for neighbor, ndistance in adj[node]:
                if distance + ndistance < dist[neighbor]:
                    dist[neighbor] = distance + ndistance
                    heapq.heappush(pq, (dist[neighbor], neighbor))
        
        for i in range(N):
            if dist[i] == float('inf'):
                dist[i] = -1
        
        return dist