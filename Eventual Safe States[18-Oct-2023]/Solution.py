# >> PYTHON CODE <<

from typing import List

class Solution:
    def dfs(self, i, adj, visited, rec, presentCycle):
        if rec[i]:
            presentCycle[i] = True
            return True
        if visited[i]:
            return False

        visited[i] = True
        rec[i] = True

        for in_ in adj[i]:
            if self.dfs(in_, adj, visited, rec, presentCycle):
                presentCycle[i] = True
                return True

        rec[i] = False
        return False

    def eventualSafeNodes(self, V: int, adj: List[List[int]]) -> List[int]:
        visited = [False] * V
        rec = [False] * V
        presentCycle = [False] * V

        for i in range(V):
            if not visited[i]:
                self.dfs(i, adj, visited, rec, presentCycle)

        ans = []

        for i in range(V):
            if not presentCycle[i]:
                ans.append(i)

        return ans