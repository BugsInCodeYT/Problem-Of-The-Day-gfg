//  >> JAVA CODE <<

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        int n=matrix.length,m=matrix[0].length;
        
        boolean[] rows=new boolean[n];
        boolean[] cols=new boolean[m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==1)
                {
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(rows[i]==true || cols[j]==true)
                {
                    matrix[i][j]=1;
                }
            }
        }
        
    }
}