//  >> CPP CODE <<

class Solution
{
	public:
	//Function to find the level of node X.
	int nodeLevel(int V, vector<int> adj[], int X) {
    int level = 0;
    queue<int> q;
    vector<bool> visited(V, false);

    q.push(0);

    while (!q.empty()) {
        int size = q.size();

        for (int i = 0; i < size; i++) {
            int nn = q.front();
            q.pop();
            visited[nn] = true;

            if (nn == X)
                return level;

            for (int neighbor : adj[nn]) {
                if (!visited[neighbor])
                    q.push(neighbor);
            }
        }

        level++;
    }

    return -1;
}
};