//  >> JAVA CODE <<

class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public void dfs(int i,ArrayList<ArrayList<Integer>> adj,boolean[] visited)
    {
        visited[i]=true;
        
        for(var v:adj.get(i))
        {
            if(visited[v]==false)
                dfs(v,adj,visited);
        }
    }
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int lastNode=0;
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                lastNode=i;
                dfs(i,adj,visited);
            }
        }
        
        Arrays.fill(visited,false);
        
        dfs(lastNode,adj,visited);
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false) return -1;
        }
        
            return lastNode;
    }
}