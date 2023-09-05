#   >> PYTHON CODE <<

class Solution:
    def printGraph(self, V : int, edges : List[List[int]]) -> List[List[int]]:
        adj = [[] for _ in range(V)]

        for edge in edges:
            u, v = edge[0], edge[1]
            adj[u].append(v)
            adj[v].append(u)

        return adj