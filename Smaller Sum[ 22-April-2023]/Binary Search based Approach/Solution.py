#    >> PYTHON CODE <<


from typing import List
from bisect import bisect_left,bisect_right

class Solution:
    
    def smallerSum(self, n : int, arr : List[int]) -> List[int]:
        '''
        #USING bisect_left FUNCTION MAKES THE PROGRAM RUN FASTER BECAUSE THAT's
        THE C IMPLEMENTATION.
        
        def binary_search(a,x):
            low=0
            high=len(a)
            
            while(low<high):
                mid=(low+high)//2
                
                if(a[mid]<x): low=mid+1
                else: high=mid
            
            return low
           ''' 
        ans=[]
        listCopy=[]
        prefixSum=[]
        
        for i in range(n):
            listCopy.append(arr[i])
        
        listCopy.sort()
        prefixSum=listCopy[:]
        
        for i in range(1,n):
            prefixSum[i]+=prefixSum[i-1]
        
        
        for val in arr:
            index=bisect_left(listCopy,val)
            
            if(index != 0):
                ans.append(prefixSum[index-1])
            else:
                ans.append(0)
            
        return ans