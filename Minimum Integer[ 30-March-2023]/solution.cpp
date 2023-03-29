

//		>> C++ CODE <<

class Solution {
    public static int minimumInteger(int N, int[] A) {
        
        long sum=Arrays.stream(A).summaryStatistics().getSum();
        
        
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<N;i++)
        {
            long mul=((long)N*(long)A[i]);

            if(sum<=mul)
            {
                ans=Math.min(ans,A[i]);
            }
        }
        
            return ans;
    }
}
        