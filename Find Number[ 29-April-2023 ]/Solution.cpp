// >> C++ CODE <<

long long findNumber(long long N){
        int lst[] = {9, 1, 3, 5, 7};
        long long num = 0;
        long long p = 1;
    
        while (N != 0) {
            int rem = N % 5;
            num = num + lst[rem] * p;
            if (N % 5 == 0) {
                N--;
            }
            p *= 10;
            N /= 5;
        }
        
            return num;
    }