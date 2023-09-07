//  >> CPP CODE <<

class Solution {
  public:
    int minimumMultiplications(vector<int>& arr, int start, int end) {
        
        int level = 0;
        
        bool visited[100001];
        memset(visited, false, sizeof(visited));
    
        queue<int> q;
        q.push(start);
        visited[start] = true;
    
        while (!q.empty()) {
            int size = q.size();
        
            for (int i = 0; i < size; i++) {
                int current = q.front();
                q.pop();
                
                if (current == end) {
                    return level;
                }
            
                for (int number : arr) {
                    int newStart = (current * number) % 100000;
                    if (!visited[newStart]) {
                        q.push(newStart);
                        visited[newStart] = true;
                    }
                }
            }
        
            level++;
        }

            return -1;
    }
};