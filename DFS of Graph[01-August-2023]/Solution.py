#  >> PYTHON CODE <<

class Solution:
    
    #Function to return a list containing the DFS traversal of the graph.
    def dfsOfGraph(self, V, adj):
        def dfs(i,adj,ans,visited):
            visited[i]=True
            ans.append(i)
            
            for nei in adj[i]:
                if(visited[nei]==False):
                    dfs(nei,adj,ans,visited)
            
        ans=[]
        visited=[False]*V
        
        dfs(0,adj,ans,visited)
        
        return ans