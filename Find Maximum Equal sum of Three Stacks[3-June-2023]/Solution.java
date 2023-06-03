//  >> JAVA CODE <<

class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        
        int sum1=(int)Arrays.stream(S1).summaryStatistics().getSum();
        int sum2=(int)Arrays.stream(S2).summaryStatistics().getSum();
        int sum3=(int)Arrays.stream(S3).summaryStatistics().getSum();
        
        int i=0,j=0,k=0;
        
        while(i<S1.length && j<S2.length && k<S3.length)
        {
            if(sum1==sum2 && sum2==sum3)
                return sum1;
            
            int max=Math.max(sum1,Math.max(sum2,sum3));
            
            if(max==sum1)
            {
                sum1-=S1[i];
                i++;
            }
            else if(max==sum2)
            {
                sum2-=S2[j];
                j++;
            }
            else
            {
                sum3-=S3[k];
                k++;
            }
        }
        
            return 0;
        
    }
}