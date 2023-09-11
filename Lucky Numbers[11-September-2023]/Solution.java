//   >> JAVA CODE <<

class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean check(int n,int i)
    {
        if(n<i) return true;
        if(n%i==0) return false;
        
        return check(n-n/i,i+1);
        
    }
    public static boolean isLucky(int n)
    {
        return check(n,2);
    }
}