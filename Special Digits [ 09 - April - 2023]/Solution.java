// >> JAVA CODE <<

static int mod=(int)1e9+7;
    
    public static boolean check(int num,int C,int D)
    {
        while(num>0)
        {
            int val=num%10;
            if(val==C || val==D) return true;
            num/=10;
        }
        
            return false;
    }
    public static long binPower(long a ,long n){
        long res = 1;
        
        while(n>0){
            if(n % 2!=0)
            res = (res * a) % mod;
            a = (a * a) % mod;
            n /= 2;
        }
        return res;
        
    }
    public static int bestNumbers(int N, int A, int B, int C, int D) {
        
        if(A==B)
        {
            if(check(N*A,C,D)) return 1;
            
                return 0;
        }
        
        long[] fact=new long[N + 1];
        
        fact[0] = 1;
        for(int i = 1 ; i <= N ; i++)
        fact[i] = (fact[i - 1] * 1L * i) % mod;
        
        long ans=0;
        
        for(int i=0;i<=N;i++)
        {
            int sum=i*A+(N-i)*B;
            if(check(sum,C,D))
            {
                ans+=fact[N]*binPower((fact[i]*fact[N-i])%mod,mod-2);
                ans%=mod;
            }
        }
        
        
            return (int)(ans);
    }
