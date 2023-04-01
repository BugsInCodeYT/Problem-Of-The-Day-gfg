long long int minOperations(int N) {
        
        long mid = N / 2;
        
        return (N % 2 == 0) ? (long)mid * (long)mid : (long)mid * (long)(mid + 1);
    }