class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<N;i++)
        {
            ans=Math.min(ans,Math.abs(cur-pos[i])*time[i]);
        }
        
            return ans;
    }
}