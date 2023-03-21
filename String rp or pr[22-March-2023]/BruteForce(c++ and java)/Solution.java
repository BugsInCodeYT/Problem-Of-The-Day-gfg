//				>> JAVA CODE <<

class Solution 
{ 
    static long recUtil(int X,int Y,String S)
    {
        if(S.length()==0) return 0;
        
        long max=0;
        
        for(int i=0;i<S.length()-1;i++)
        {
            if(S.charAt(i)=='r' && S.charAt(i+1)=='p')
            {
                String str=S.substring(0,i)+S.substring(i+2,S.length());
                max=Math.max(max,Y+recUtil(X,Y,str));
            }
            else if(S.charAt(i)=='p' && S.charAt(i+1)=='r')
            {
                String str=S.substring(0,i)+S.substring(i+2,S.length());
                max=Math.max(max,X+recUtil(X,Y,str));
            }
        }
        
            return max;
    }
    static long solve(int X,int Y, String S)
	{    
	    return recUtil(X,Y,S);
	}
} 