// >> CPP CODE <<

class Solution{
public: 
    long long int largestPrimeFactor(int N){
        
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
};