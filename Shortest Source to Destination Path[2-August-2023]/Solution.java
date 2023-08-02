//  >> JAVA CODE <<

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        
        if(A[0][0]==0) return -1;
        
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[N][M];
        int path=0;
        
        q.add(new int[]{0,0});
        visited[0][0]=true;
        
        while(!q.isEmpty())
        {
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                int[] cur=q.poll();
                
                if(cur[0]==X && cur[1]==Y) return path;
                
                if(cur[0]+1<N && !visited[cur[0]+1][cur[1]] && A[cur[0]+1][cur[1]]==1)
                {
                    q.add(new int[]{cur[0]+1,cur[1]});
                    visited[cur[0]+1][cur[1]]=true;
                }
                if(cur[0]-1>=0 && !visited[cur[0]-1][cur[1]] && A[cur[0]-1][cur[1]]==1)
                {
                    q.add(new int[]{cur[0]-1,cur[1]});
                    visited[cur[0]-1][cur[1]]=true;
                }
                if(cur[1]+1<M && !visited[cur[0]][cur[1]+1] && A[cur[0]][cur[1]+1]==1)
                {
                    q.add(new int[]{cur[0],cur[1]+1});
                    visited[cur[0]][cur[1]+1]=true;
                }
                if(cur[1]-1>=0 && !visited[cur[0]][cur[1]-1] && A[cur[0]][cur[1]-1]==1)
                {
                    q.add(new int[]{cur[0],cur[1]-1});
                    visited[cur[0]][cur[1]-1]=true;
                }
            }
            
            path++;
        }
        
            return -1;
    }
};