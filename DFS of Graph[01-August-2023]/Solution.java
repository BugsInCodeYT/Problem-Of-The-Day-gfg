//  >> JAVA CODE <<

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void dfs(int i,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans,boolean[] visited)
    {
        
        visited[i]=true;
        ans.add(i);
        
        for(Integer in:adj.get(i))
        {
            if(visited[in]==false)
                dfs(in,adj,ans,visited);
        }
        
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] visited=new boolean[V];
        
        dfs(0,adj,ans,visited);
        
        return ans;
    }
}