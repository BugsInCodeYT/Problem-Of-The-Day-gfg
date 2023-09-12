//  >> C++ CODE << 

class Solution {
  public:
    int isPerfectNumber(long long N) {
        
        if(N==1) return 0;
        
        long sum=1;
        
        for(int i=2;i<=sqrt(N);i++)
        {
            if(N%i==0){
                if(N/i!=i)
                    sum+=i+N/i;
                else
                    sum+=i;
            }
        }
        
            return sum==N?1:0;
        
        
    }
};