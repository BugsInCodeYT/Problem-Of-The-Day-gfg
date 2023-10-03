//  >> JAVA CODE <<

class Solution
{
    String colName (long n)
    {
        StringBuffer ans=new StringBuffer("");
        
        while(n!=0)
        {
            n--;
            char ch=(char)(n%26+'A');
            ans.append(ch);
            n/=26;
        }
        
        return ans.reverse().toString();
    }
}