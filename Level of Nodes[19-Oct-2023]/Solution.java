//   >> JAVA CODE <<

class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        int level=0;
        
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[V];
        
        q.add(0);
        
        while(!q.isEmpty())
        {
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                int nn=q.poll();
                visited[nn]=true;
                
                if(nn==X) return level;
                
                for(var neighbor:adj.get(nn))
                {
                    if(visited[neighbor]==false)
                        q.add(neighbor);
                }
            }
            
            level++;
        }
        
        return -1;
    }
}