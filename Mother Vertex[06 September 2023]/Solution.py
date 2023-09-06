#   >> PYTHON CODE <<

class Solution:
    
    #Function to find a Mother Vertex in the Graph.
	def findMotherVertex(self, V, adj):
	    def dfs(i,adj,visited):
	        visited[i]=True
	        
	        for v in adj[i]:
	            if(visited[v]==False):
	                dfs(v,adj,visited)
	        
		lastNode=0
	    visited=[False]*V
	    
	    for i in range(V):
	        if(visited[i]==False):
	            dfs(i,adj,visited)
	            lastNode=i
	    
	    for i in range(V):
	        visited[i]=False
	       
	    dfs(lastNode,adj,visited)
	    
	    for i in range(V):
	        if(visited[i]==0):
	            return -1
	    
	    return lastNode
	    
