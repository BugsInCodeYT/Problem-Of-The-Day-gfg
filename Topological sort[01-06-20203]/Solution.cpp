//  >> C++ CODE <<

vector<int> topoSort(int V, vector<int> adj[]) {
    vector<int> indegree(V, 0);

    for (int i = 0; i < V; ++i) {
        for (int nn : adj[i]) {
            indegree[nn]++;
        }
    }

    queue<int> queue;
    vector<int> ans;

    for (int node = 0; node < V; ++node) {
        if (indegree[node] == 0) {
            queue.push(node);
        }
    }

    while (!queue.empty()) {
        int node = queue.front();
        queue.pop();
        ans.push_back(node);

        for (int i : adj[node]) {
            indegree[i]--;
            if (indegree[i] == 0) {
                queue.push(i);
            }
        }
    }

    return ans;
}