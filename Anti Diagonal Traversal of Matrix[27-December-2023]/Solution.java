//      >> JAVA CODE <<

class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(map.get(i+j)==null)
                    map.put(i+j,new ArrayList<>());
                
                map.get(i+j).add(matrix[i][j]);
            }
        }
        
        int[] ans=new int[n*n];
        int ind=0;
        for(int i=0;i<=2*(n-1);i++)
        {
            List<Integer> list=map.get(i);
            for(int value: list)
            {
                ans[ind++]=value;
            }
        }
        
            return ans;
    }
}