//   >> JAVA CODE <<


class Solution {
    public static int greatestCommonDivisor(int a,int b)
    {
        if(b==0) return a;
        
        return greatestCommonDivisor(b,a%b);
    }
    public static int minimumNumber(int n, int[] arr) {
        
        int gcd=0;
        
        for(int i=0;i<n;i++)
        {
            gcd=greatestCommonDivisor(gcd,arr[i]);
        }
        
            return gcd;
    }
}
