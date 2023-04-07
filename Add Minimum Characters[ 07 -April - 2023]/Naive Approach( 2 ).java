//	>> JAVA CODE <<	  

        int n=str.length();
        int i=0,j=n-1,lpfs=n-1;
        
        while(i<j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
            else {
                i=0;
                lpfs--;
                j=lpfs;
            }
        }
        
        return n-lpfs-1;