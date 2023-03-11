class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        
        var i=0;
        var j=N-1;
        
        var row=-1;
        
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
        
        return new int[]{row,N-j-1};
    }
};