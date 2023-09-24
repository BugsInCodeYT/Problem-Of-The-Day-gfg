#  >> PYTHON CODE <<

class Solution:
    def duplicates(self, arr, n): 
    	
    	base=n
    	ans=[]
    	for i in range(n):
    	    num=arr[i]%base
    	    
    	    arr[num]=base+arr[num]; 
    	   
    	
    	for i in range(n):
            if(arr[i]//base>1): ans.append(i)
        

        return ans if len(ans)!=0 else [-1]