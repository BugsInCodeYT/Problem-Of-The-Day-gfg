//  >> C++ CODE <<

class Solution
{
    public:
    string reverseWord(string str)
    {
        string ans="";
        
        for(int i=str.length()-1;i>=0;i--)
        {
            ans+=str[i];
        }
        
            return ans;
    }
};