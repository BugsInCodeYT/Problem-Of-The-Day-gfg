#  >> PYTHON CODE <<

class Solution:
	def isDivisible(self, s):
	    sum=0
	    for i in range(len(s)):
	        if(s[i]=='1'):
	            if(i%2==0):
	                sum+=1
	            else:
	                sum+=2
        
        return 1 if sum%3==0 else 0