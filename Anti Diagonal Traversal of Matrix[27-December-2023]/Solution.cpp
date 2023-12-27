//         >> CPP CODE <<

class Solution {
  public:
    vector<int> antiDiagonalPattern(vector<vector<int>> matrix) 
    {
        unordered_map<int, vector<int>> map;
        int n = matrix.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map.find(i + j) == map.end())
                    map[i + j] = vector<int>();
                
                map[i + j].push_back(matrix[i][j]);
            }
        }
        
        vector<int> ans(n * n);
        int ind = 0;
        for (int i=0;i<=2*(n-1);i++) {
            vector<int> list=map[i];
            for (int value : list) {
                ans[ind++] = value;
            }
        }
        
        return ans;
    }
};