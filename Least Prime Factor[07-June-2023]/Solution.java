//  >> JAVA CODE <<

public int[] leastPrimeFactor(int n)
    {
        int[] primes=new int[n+1]; 
        Arrays.fill(primes,-1);
        primes[0] = 0;
        primes[1] = 1;
    
        int i = 2;
        while (i <= n) {
            int j = i;
            while (j <= n) {
                if (primes[j] == -1) {
                    primes[j] = i;
                }
                j += i;
            }
            i++;
        }
    
        return primes;
    }