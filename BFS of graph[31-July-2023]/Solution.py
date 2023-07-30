#  >> PYTHON CODE <<

from typing import List
from queue import Queue

class Solution:
    #Function to return Breadth First Traversal of given graph.
    def bfsOfGraph(self, V: int, adj: List[List[int]]) -> List[int]:
        
        ans=[]
        q=Queue()
        visited=[False]*V
        
        q.put(0)
        visited[0]=True
        
        while(not q.empty()):
            u=q.get()
            
            ans.append(u)
            
            for el in adj[u]:
                if visited[el]==False:
                    q.put(el)
                    visited[el]=True

        return ans