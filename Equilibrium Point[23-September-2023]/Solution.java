//  >> JAVA CODE <<

class Solution {

    public static int equilibriumPoint(long arr[], int n) {
        
        long sum=Arrays.stream(arr).summaryStatistics().getSum();
        long ss=0;
        
        for(int i=0;i<n;i++)
        {
            if(ss==sum-ss-arr[i]) return i+1;
            ss+=arr[i];
        }
        
            return -1;
    }
}