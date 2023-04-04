	>> JAVA CODE <<

	int minSteps(String str) {
	
	    int acount=0;
	    int bcount=0;
	    char prev='#';
	    
	    for(int i=0;i<str.length();i++)
	    {
	        char ch=str.charAt(i);
	        if(prev==ch) continue;
	        
	        if(ch=='a') acount++;
	        else bcount++;
	        
	        prev=ch;
	    }
		
		    return Math.min(acount,bcount)+1;
	}
