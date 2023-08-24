#  >> PYTHON CODE <<

class Solution:
	def isPalindrome(self, S):
	    low,high=0,len(S)-1
	    
	    while(low<high):
	        if(S[low]!=S[high]): return 0
	        
	        low+=1
	        high-=1
	       
	    return 1
