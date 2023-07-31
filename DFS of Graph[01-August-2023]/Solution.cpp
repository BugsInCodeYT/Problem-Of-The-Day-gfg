// >> CPP CODE <<

class Solution {
  public:
    // Function to return a list containing the DFS traversal of the graph.
    void dfs(int i,vector<int> adj[],vector<int>& ans,vector<bool>& visited)
    {
        visited[i]=true;
        ans.push_back(i);
        
        for(int in : adj[i])
        {
            if(visited[in]==false)
                dfs(in,adj,ans,visited);
        }
    }
    vector<int> dfsOfGraph(int V, vector<int> adj[]) {
        vector<int> ans;
        vector<bool> visited(V,false);
        
        dfs(0,adj,ans,visited);
        
        return ans;
    }
};