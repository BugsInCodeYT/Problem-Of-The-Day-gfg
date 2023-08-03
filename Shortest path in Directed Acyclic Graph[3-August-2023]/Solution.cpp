// >> C++ CODE <<

class Solution {
  public:
     vector<int> shortestPath(int N, int M, vector<vector<int>>& edges) {
        vector<vector<vector<int>>> adj(N);
        
        for (int i = 0; i < N; i++)
            adj[i] = vector<vector<int>>();
        
        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            
            vector<int> t1 = {v, w};
            adj[u].push_back(t1);
        }
        
        priority_queue<vector<int>, vector<vector<int>>, greater<vector<int>>> pq;
        vector<int> dist(N, numeric_limits<int>::max());
        
        dist[0] = 0;
        pq.push({0, 0});
        
        while (!pq.empty()) {
            vector<int> values = pq.top();
            pq.pop();
            
            int node = values[0];
            int distance = values[1];
            
            for (vector<int> in : adj[node]) {
                int neighbor = in[0];
                int ndistance = in[1];
                if (distance + ndistance < dist[neighbor]) {
                    dist[neighbor] = distance + ndistance;
                    pq.push({neighbor, dist[neighbor]});
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (dist[i] == numeric_limits<int>::max()) {
                dist[i] = -1;
            }
        }
        
        return dist;
    }
};