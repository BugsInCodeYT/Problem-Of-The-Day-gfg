//   >> CPP CODE <<

class Solution{
public:
    bool check(int n,int i)
    {
        if(n<i) return true;
        if(n%i==0) return false;
        
        return check(n-n/i,i+1);
    }
    bool isLucky(int n) {
        return check(n,2);
    }
};