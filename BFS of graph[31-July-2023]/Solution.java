//  >> JAVA CODE <<

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> bfs=new ArrayList<>();
        
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[V];
        
        q.add(0);
        visited[0]=true;
        
        while(!q.isEmpty())
        {
            int u=q.poll();
            
            bfs.add(u);
            
            for(Integer in:adj.get(u))
            {
                if(visited[in]==false){
                q.add(in);
                visited[in]=true;
                }
            }
        }
        
        return bfs;
    }
}