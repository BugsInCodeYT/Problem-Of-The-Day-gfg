#   >> PYTHON CODE <<

class Solution:
    def printClosest (self,arr, brr, n, m, x) : 
        i,j=0,m-1
        diff=1e9
        val1,val2=-1,-1
        while(i<n and j>=0):
            sum=arr[i]+brr[j]
            
            if(abs(sum-x)<diff):
                diff=abs(sum-x)
                val1,val2=arr[i],brr[j]
                
            
            if(sum<=x):
                i+=1
            else:
                j-=1
        
        return [val1,val2]