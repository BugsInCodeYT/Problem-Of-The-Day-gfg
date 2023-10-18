//  >> CPP CODE <<

class Solution {
  public:
    bool dfs(int i, vector<int> adj[], vector<bool>& visited, vector<bool>& rec, vector<bool>& presentCycle) {
        if (rec[i]) return presentCycle[i] = true;
        if (visited[i]) return false;

        visited[i] = true;
        rec[i] = true;

        for (int in : adj[i]) {
            if (dfs(in, adj, visited, rec, presentCycle)) return presentCycle[i] = true;
        }

        rec[i] = false;
        return false;
    }

    vector<int> eventualSafeNodes(int V, vector<int> adj[]) {
        vector<bool> visited(V, false);
        vector<bool> rec(V, false);
        vector<bool> presentCycle(V, false);

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, rec, presentCycle);
            }
        }

        vector<int> ans;

        for (int i = 0; i < V; i++) {
            if (!presentCycle[i]) {
                ans.push_back(i);
            }
        }

        return ans;
    }
};