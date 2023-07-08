#  >> PYTHON CODE <<

class Solution:
    
    #Function to find the smallest positive number missing from the array.
    def missingNumber(self,arr,n):
        
        i=0
        
        while(i<n):
            el=arr[i]
            index=el-1
            
            if(index>=0 and index<n):
                if(arr[index]!=el):
                    arr[index],arr[i]=arr[i],arr[index]
                    continue
            i+=1
        
        for i in range(n):
            if(arr[i]!=i+1):
                return i+1
        
        return n+1