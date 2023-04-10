//	>> JAVA CODE <<

class Solution {
    public int maxIntersections(int[][] lines, int N) {
        
        int[] slines=new int[N];
        int[] elines=new int[N];
        
        for(int i=0;i<N;i++)
        {
            slines[i]=lines[i][0];
            elines[i]=lines[i][1];
        }
        
        Arrays.sort(slines); Arrays.sort(elines);
        
        int i=0;
        int j=0;
        int intersections=0;
        int finalAns=Integer.MIN_VALUE;
        
        while(i<N && j<N)
        {
            if(slines[i]<=elines[j])
            {
                intersections++;
                finalAns=Math.max(finalAns,intersections);
                i++;
            }
            else
            {
                intersections--;
                j++;
            }
        }
        
            return finalAns;
    }
}