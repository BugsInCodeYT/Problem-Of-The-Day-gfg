

//			>> QUEUE BASED APPROACH


class Solution {
    static void bfs(int[] cor,ArrayList<ArrayList<Character>> grid,int N, int M,int[] min)
    {
        
        boolean[][] visited=new boolean[N][M];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{cor[0],cor[1]});
        
        while(!q.isEmpty())
        {
            int[] nn=q.poll();
            
            int x=nn[0],y=nn[1];
            
            if(x+1<N && visited[x+1][y]==false)
            {
                visited[x+1][y]=true;
                if(grid.get(x+1).get(y)=='O')   
                q.add(new int[]{x+1,y});
                else if(grid.get(x+1).get(y)=='Y'){
                    int distance=Math.abs(x+1-cor[0])+Math.abs(y-cor[1]);
                    min[0]=Math.min(min[0],distance);
                }
            }
            if(x-1>=0 && visited[x-1][y]==false)
            {
                visited[x-1][y]=true;
                
                if(grid.get(x-1).get(y)=='O')   
                q.add(new int[]{x-1,y});
                else  if(grid.get(x-1).get(y)=='Y'){
                    int distance=Math.abs(x-1-cor[0])+Math.abs(y-cor[1]);
                    min[0]=Math.min(min[0],distance);
                }
            }
            if(y+1<M && visited[x][y+1]==false)
            {
                visited[x][y+1]=true;
                
                if(grid.get(x).get(y+1)=='O')   
                q.add(new int[]{x,y+1});
                else  if(grid.get(x).get(y+1)=='Y'){
                    
                    int distance=Math.abs(x-cor[0])+Math.abs(y+1-cor[1]);
                    min[0]=Math.min(min[0],distance);
                }
            }
            if(y-1>=0 && visited[x][y-1]==false)
            {
                visited[x][y-1]=true;
                
                if(grid.get(x).get(y-1)=='O')   
                q.add(new int[]{x,y-1});
                else  if(grid.get(x).get(y-1)=='Y'){
                    
                    int distance=Math.abs(x-cor[0])+Math.abs(y-1-cor[1]);
                    min[0]=Math.min(min[0],distance);
                }
            }
            
        }
        
        
    }
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,int M) {
        
        int[] min={Integer.MAX_VALUE};
        
        ArrayList<int[]> list=new ArrayList<>(); 
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                char ch=grid.get(i).get(j);
                if(ch=='X') list.add(new int[]{i,j});
            }
        }
        
        for(int[] coordinates:list)
        {
            bfs(coordinates,grid,N,M,min);
        }
        
            return min[0];
    }
};