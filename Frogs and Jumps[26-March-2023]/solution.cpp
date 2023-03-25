//			>> C++ CODE <<

class Solution {
  public:
    int unvisitedLeaves(int N, int leaves, int frogs[]) {
        
       vector<bool> visited(leaves + 1, false);
    int cnt = 0;
    for (int i = 0; i < N; i++) {
        int frog = frogs[i];
        if (frog <= leaves && visited[frog]) {
            continue;
        }
        for (int j = frog; j <= leaves; j += frog) {
            visited[j] = true;
        }
    }
    for (int i = 1; i <= leaves; i++) {
        if (!visited[i]) {
            cnt++;
        }
    }
    return cnt;
    }
};