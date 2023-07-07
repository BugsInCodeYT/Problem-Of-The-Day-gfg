#  >> PYTHON CODE <<

class Solution:
    #Function to find triplets with zero sum.    
    def findTriplets(self, arr, n):
        arr.sort()
        
        for i in range(n-2):
            j=i+1
            k=n-1
            
            while(j<k):
                sum=arr[i]+arr[j]+arr[k]
                if(sum==0):
                    return 1
                elif sum>0:
                    k-=1
                else:
                    j+=1
                    
        return 0