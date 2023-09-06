//  >> CPP CODE <<

class Solution {
public:
    // Function to find a Mother Vertex in the Graph.
    void dfs(int i, vector<int> adj[], vector<bool>& visited) {
        visited[i] = true;
        
        for (int v : adj[i]) {
            if (!visited[v]) {
                dfs(v, adj, visited);
            }
        }
    }

    int findMotherVertex(int V, vector<int>adj[]) {
        int lastNode = 0;
        vector<bool> visited(V, false);

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                lastNode = i;
                dfs(i, adj, visited);
            }
        }
        
        fill(visited.begin(), visited.end(), false);
        
        dfs(lastNode, adj, visited);
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                return -1;
            }
        }
        
        return lastNode;
    }
};