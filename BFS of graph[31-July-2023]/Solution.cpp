//  >> CPP CODE <<

class Solution {
  public:
    // Function to return Breadth First Traversal of given graph.
    vector<int> bfsOfGraph(int V, vector<int> adj[]) {
        vector<int> ans;
        queue<int> q;
        bool visited[V] = {false};
        
        q.push(0);
        visited[0] = true;
        
        while(!q.empty()) {
            int u = q.front();
            q.pop();
            
            ans.push_back(u);
            
            for(auto el : adj[u]) {
                if(!visited[el]) {
                    q.push(el);
                    visited[el] = true;
                }
            }
        }
        
        return ans;
    }
};