//		>> JAVA CODE <<

static int xmod11(String x)
	{    
	    
	    int n=x.length();
        
        int r=0;
        
        for(int i=0;i<n;i++)
        {
            int num=r*10+(int)(x.charAt(i)-'0');
            r=num%11;
        }
        
        return r;
	 
	}