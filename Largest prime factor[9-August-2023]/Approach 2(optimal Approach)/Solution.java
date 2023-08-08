// >> JAVA CODE <<

class Solution{

    static long largestPrimeFactor(int N) {
        
        long st=2;
        
        while(st*st<=N)
        {
            if(N%st==0)
            {
                N/=st;
            }
            else
            {
                st++;
            }
        }
        
            return N;
    }
}