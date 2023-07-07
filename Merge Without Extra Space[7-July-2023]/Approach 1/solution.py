#  >> PYTHON CODE <<

class Solution:
    
    #Function to merge the arrays.
    def merge(self,arr1,arr2,n,m):
        i,j,k=0,0,n-1
        
        while(i<=k and j<m):
            if(arr1[i]<arr2[j]): 
                i+=1
            else:
                arr2[j],arr1[k]=arr1[k],arr2[j]
                j+=1
                k-=1
        
        arr1.sort()
        arr2.sort()