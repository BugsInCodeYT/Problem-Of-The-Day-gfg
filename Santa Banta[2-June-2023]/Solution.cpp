//   >> C++ CODE <<

class Solution{
public:
    vector<bool> store;
    vector<int> primes;

    void precompute() {
        int size = 1299723;
        store.resize(size, false);

        for (int i = 2; i < size; i++) {
            for (int j = i + i; j < size; j += i) {
                store[j] = true;
            }
        }

        for (int i = 2; i < size; i++) {
            if (!store[i]) {
                primes.push_back(i);
            }
        }
    }

    void dfs(int i, vector<vector<int>>& adj, int& curCount, vector<bool>& visited) {
        if (visited[i]) return;

        visited[i] = true;
        curCount += 1;

        for (int x : adj[i]) {
            if (!visited[x]) {
                dfs(x, adj, curCount, visited);
            }
        }
    }

    int helpSanta(int n, int m,vector<vector<int>> &adj) {
        
        int maxGroupSize = 0;
        vector<bool> visited(n + 1, false);

        for (int i = 0; i <= n; i++) {
            if (!visited[i]) {
                int curCount = 0;
                dfs(i, adj, curCount, visited);
                maxGroupSize = max(maxGroupSize, curCount);
            }
        }

        if (maxGroupSize == 1) return -1;

        return primes[maxGroupSize - 1];
    }
};