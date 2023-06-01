# >> PYTHON CODE <<

class Solution:
    
    #Function to return list containing vertices in Topological order.
    def topoSort(self, V, adj):
        indegree=[0]*V
        
        for i in range(V):
            for nn in adj[i]:
                indegree[nn]+=1

        queue=[]
        ans=[]
        
        for node in range(V):
            if(indegree[node]==0):
                queue.append(node)
        
        
        while(len(queue)>0):
            node=queue[0]
            queue.pop(0)
            ans.append(node)
            
            for i in adj[node]:
                indegree[i]-=1
                if((indegree[i]) == 0):
                    queue.append(i)
        
        return ans