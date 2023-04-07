//	>> JAVA CODE <<

public static boolean isPalindrome(String str,int low,int high)
    {
        while(low<high)
        {
            if(str.charAt(low++)!=str.charAt(high--)) return false;
        }
        
            return true;
    }
	public static int addMinChar(String str){
        
        int plen=1;
        
        for(int i=1;i<str.length();i++)
        {
            if(isPalindrome(str,0,i))
            {
                plen=i+1;
            }
        }
        
            return str.length()-plen;
        
	}