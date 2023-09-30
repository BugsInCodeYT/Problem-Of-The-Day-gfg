//    >> CPP CODE <<

class Solution
{   
    public:
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(vector<vector<int> > &matrix)
    {
        int n=matrix.size(),m=matrix[0].size();
        
        bool rows[n];
        bool cols[m];
        
        for(int i=0;i<n;i++) rows[i]=false;
        for(int j=0;j<m;j++) cols[j]=false;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==1)
                {
                    rows[i]=true; cols[j]=true;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(rows[i] or cols[j]) matrix[i][j]=1;
            }
        }
        

    }
};