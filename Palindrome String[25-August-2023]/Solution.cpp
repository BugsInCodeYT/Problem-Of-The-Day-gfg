//  >> C++ CODE <<

class Solution{
public:	
	
	
	int isPalindrome(string S)
	{
	    int low=0,high=S.length()-1;
	    
	    while(low<high)
	    {
	        if(S[low]!=S[high]) return 0;
	        
	        low++; high--;
	    }
	    
	        return 1;
	}

};