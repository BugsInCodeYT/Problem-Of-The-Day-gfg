#  >> PYTHON CODE <<

class Solution:
    #Function to find triplets with zero sum.    
    def findTriplets(self, arr, n):
        arr.sort()
        
        for i in range(n-2):
            j=i+1
            k=n-1
            
            target=-arr[i]
            while(j<k):
                sum=arr[j]+arr[k]
                if(sum==target):
                    return 1
                elif sum>target:
                    k-=1
                else:
                    j+=1
                    
        return 0
