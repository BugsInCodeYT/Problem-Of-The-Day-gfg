//    >> JAVA CODE <<

class Solution
{
    boolean[] primes;
    int MAX;
    Solution()
    {
        MAX=1000001;
        primes=new boolean[MAX];
        Arrays.fill(primes,true);
        primes[1]=false;
        
        for(int i=2;i*i<MAX;i++)
        {
            if(primes[i]){
                for(int j=i*2;j<MAX;j+=i)
                {
                    primes[j]=false;
                }
            }
        }
    }
    public int minNumber(int arr[], int N)
    {
        int sum=0;
        
        for(int i=0;i<N;i++) sum+=arr[i];
        
        int st=sum;
        
        while(primes[st]==false)
            st++;
            
        return st-sum;
    }
}