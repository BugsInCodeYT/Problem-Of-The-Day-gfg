//	>> JAVA CODE <<

public static int computeLPSArray(String str)
    {
        int n=str.length();
        
        int[] lps=new int[n];
        
        int len=0;
        int i=1;
        lps[0]=0;
        
        while(i<n)
        {
            if(str.charAt(i)==str.charAt(len))
            {
                len++;
                lps[i++]=len;
            }
            else
            {
                if(len>0)
                    len=lps[len-1];
                else
                    lps[i++]=0;
            }
        }
        
            return lps[n-1];
    }
	public static int addMinChar(String str){
        
        StringBuffer revStr=new StringBuffer(str);
        revStr.reverse();
        
        String newString=str+"$"+revStr.toString();
        
        int lpfs=computeLPSArray(newString);
        
        
            return str.length()-lpfs;
	}