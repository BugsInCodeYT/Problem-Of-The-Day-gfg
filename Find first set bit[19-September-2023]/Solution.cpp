//   >>  CPP CODE <<

class Solution
{
    public:
    //Function to find position of first set bit in the given number.
    unsigned int getFirstSetBit(int n)
    {
        int pos=1;
        
        while(n!=0)
        {
            int bit=n%2;
            
            if(bit==1) return pos;
            
            pos++;
            n/=2;
        }
        
            return 0;
    }
};

