//     >> JAVA CODE <<

class Solution {
    public long minOperations(int N) {
        
        int medIndex=N%2==0?N/2:N/2;
        
        int median=N%2==0?medIndex*2+1:medIndex*2;
        
        int ans=0;
        
        for(int i=0;i<N;i++)
        {
            int el=i*2+1;
            
            ans+=Math.abs(el-median);
        }
        
            return ans/2;
    }
}