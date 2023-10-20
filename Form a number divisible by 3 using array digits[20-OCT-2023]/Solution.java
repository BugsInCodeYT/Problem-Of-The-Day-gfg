//  >> JAVA CODE <<

class Solution {
    static int isPossible(int N, int arr[]) {
        long sum=0;
        
        for(int i=0;i<N;i++)
        {
            sum+=arr[i];
        }
        
        return sum%3==0?1:0;
    }
}