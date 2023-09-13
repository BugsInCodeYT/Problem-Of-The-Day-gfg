//  >> CPP CODE <<

class Solution{
public:
    string findLargest(int N, int S){
        if(S>N*9 or (S==0 and N>1)) return "-1";
        
        string num="";
        
        while(S>=9)
        {
            num+="9";
            N-=1;
            S-=9;
        }
        
        while(N>0)
        {
            if(S>0)
            {
                num+=to_string(S);
                S=0;
            }
            else
                num+="0";
            
            N--;
        }
        
            return num;
    }
};