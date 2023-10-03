//  >> CPP CODE <<

class Solution{
    public:
   string colName (long long int n)
    {
        string ans;
        while(n){
            char c = --n % 26 + 'A';
            ans = c + ans;
            n /= 26;
        }
        return ans;
    }
};