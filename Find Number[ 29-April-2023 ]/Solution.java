// >> JAVA CODE <<

public long findNumber(long N)
    {
        int[] lst={9,1,3,5,7};
        long num=0;
        long p=1;
        
        while(N!=0)
        {
            int rem=(int)(N%5);
            num=num+lst[rem]*p;
            if(N%5==0) N--;
            p*=10;
            N/=5;
        }
        
        return num;
    }