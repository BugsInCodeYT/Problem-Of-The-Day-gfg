
class Solution {
public:
    vector<int> findMaxRow(vector<vector<int>> mat, int N) {
        int i=0;
        int j=N-1;
        int row=-1;
    
        while(i<N && j>=0)
        {
            if(mat[i][j]==1)
            {
                row=i;
                j--;
            }
            else
            {
                i++;
            }
        }
        
        vector<int> result;
        
        result.push_back(row);
        result.push_back(N-j-1);
        
            return result;
    }
};