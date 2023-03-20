// User function Template for C++

class Solution {
  public:
    int shortestXYDist(vector<vector<char>> grid, int n, int m) {
        vector<pair<int,int>> x_indices;
        vector<pair<int,int>> y_indices;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='X')
                {
                    x_indices.push_back({i,j});
                }
                else if(grid[i][j]=='Y')
                {
                    y_indices.push_back({i,j});    
                }
            }
        }
        
        int ans=INT_MAX;
        
        for(auto & X:x_indices)
        {
            int Xi=X.first;
            int Xj=X.second;
            
            for(auto & Y:y_indices)
            {
                int Yi=Y.first;
                int Yj=Y.second;
                
                ans=min(ans,abs(Xi-Yi)+abs(Xj-Yj));
            }
        }
        
            return ans;
    }
};