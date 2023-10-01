//  >> C++ CODE <<

class Solution
{   
    public:
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    vector<int> boundaryTraversal(vector<vector<int> > matrix, int n, int m) 
    {
        vector<int> ans;
        
        if(n==1)
        {
            for(int i=0;i<m;i++) ans.push_back(matrix[0][i]);
        }
        else if(m==1)
        {
            for(int i=0;i<n;i++) ans.push_back(matrix[i][0]);
        }
        else
        {
            for(int i=0;i<m-1;i++) ans.push_back(matrix[0][i]);
            for(int i=0;i<n-1;i++) ans.push_back(matrix[i][m-1]);
            for(int i=m-1;i>0;i--) ans.push_back(matrix[n-1][i]);
            for(int i=n-1;i>0;i--) ans.push_back(matrix[i][0]);
        }
        
            return ans;
    }
};