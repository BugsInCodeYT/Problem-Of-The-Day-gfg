#include <vector>
#include <string>

using namespace std;

class Solution {
    bool solve(int u, int v, vector<vector<int>>& graph, vector<bool>& visited) {
        if(u == v) return true;
        
        bool ans = false;
        visited[u] = true;
        
        for(int in : graph[u]) {
            if(!visited[in])
                ans = ans || solve(in, v, graph, visited);
        }
        
        return ans;
    }
    
    bool pathExists(int u, int v, vector<vector<int>>& graph) {
        vector<bool> visited(graph.size() + 1, false);
        return solve(u, v, graph, visited);
    }
    
public:
    vector<string> avoidExlosion(vector<vector<int>>& mix, int n, vector<vector<int>>& danger, int m) {
        vector<int> parent(n+1), rank(n+1, 0);
        
        for(int i = 0; i <= n; i++){
            parent[i] = i;
        }
        
        vector<vector<int>> graph(n+1);
        vector<string> ans;
        
        for(int i = 0; i < n; i++) {
            int x = mix[i][0], y = mix[i][1];
            
            graph[x].push_back(y);
            graph[y].push_back(x);
            
            bool safe = true;
            
            for(auto& dd : danger) {
                int u = dd[0], v = dd[1];
                
                if(pathExists(u, v, graph)) {
                    safe = false;
                    break;
                }
            }
            
            ans.push_back(safe ? "Yes" : "No");
            if(!safe) { 
                graph[x].pop_back();
                graph[y].pop_back();
            }
        }
        
        return ans;
    }
};
