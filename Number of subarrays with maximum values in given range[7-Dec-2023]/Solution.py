#				>>  PYTHON CODE <<

class Solution:
    def countSubarrays(self, a,n,L,R): 
        lessThanL=0
        
        j=0
        for i in range(n):
            if(a[i]<L):
                lessThanL+=(i-j+1)
            else:
                j=i+1

        #print(lessThanL)
        
        lessThanEqualR=0
        
        j=0
        for i in range(n):
            if(a[i]<=R):
                lessThanEqualR+=(i-j+1)
            else:
                j=i+1
        
        #print(lessThanEqualR)
        
        return lessThanEqualR-lessThanL