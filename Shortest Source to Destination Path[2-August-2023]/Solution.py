#  >> PYTHON CODE <<




from queue import Queue

class Solution:
    
    def shortestDistance(self,N,M,A,X,Y):
        
        if(A[0][0]==0): return -1
        
        queue=Queue()
        visited=[[False for i in range(M)] for j in range(N)]
        path=0;

        queue.put([0,0])
        visited[0][0]=True
        while(not queue.empty()):
            
            size=queue.qsize()
            
            for i in range(size):
                cur=queue.get()
                
                if(cur[0]==X and cur[1]==y): return path
                
                if(cur[0]+1<N and (not visited[cur[0]+1][cur[1]]) and A[cur[0]+1][cur[1]]==1):
                    queue.put([cur[0]+1,cur[1]])
                    visited[cur[0]+1][cur[1]]=True
                if(cur[0]-1>=0 and (not visited[cur[0]-1][cur[1]]) and A[cur[0]-1][cur[1]]==1):
                    queue.put([cur[0]-1,cur[1]])
                    visited[cur[0]-1][cur[1]]=True
                if(cur[1]+1<M and (not visited[cur[0]][cur[1]+1]) and A[cur[0]][cur[1]+1]==1):
                    queue.put([cur[0],cur[1]+1])
                    visited[cur[0]][cur[1]+1]=True
                if(cur[1]-1>=0 and (not visited[cur[0]][cur[1]-1]) and A[cur[0]][cur[1]-1]==1):
                    queue.put([cur[0],cur[1]-1])
                    visited[cur[0]][cur[1]-1]=True

            
            
            path+=1
            
            
        return -1