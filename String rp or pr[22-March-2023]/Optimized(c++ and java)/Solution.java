
//		>> JAVA CODE <<

class Solution 
{ 
    static long[] get(char c1,char c2,String str)
    {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        
        long cnt1=0,cnt2=0;
        
        s1.add(str.charAt(0));
        char temp=str.charAt(0);
        
        for(int i=1;i<str.length();i++)
        {
            if(!s1.isEmpty() && str.charAt(i)==c2 && s1.peek()==c1)
            {
                s1.pop();
                cnt1++;
            }
            else s1.add(str.charAt(i));
        }
        
        s2.add(s1.pop());
        
        temp=s2.peek();
        
        while(!s1.isEmpty())
        {
            if(!s2.isEmpty() && s1.peek()==c2 && s2.peek()==c1)
            {
                cnt2++;
                s2.pop();
            }
            else
            {
                s2.add(s1.peek());
            }
            
            s1.pop();
        }
        
        if(c1=='p') return new long[]{cnt1,cnt2}; 
        
            return new long[]{cnt2,cnt1};
    }
    static long solve(int X,int Y, String S)
	{    
	    long[] elements;
	    
	    if(X>Y)
	        elements=get('p','r',S);
	    else
	        elements=get('r','p',S);
	        
	    return elements[0]*X + elements[1]*Y;
	}
} 