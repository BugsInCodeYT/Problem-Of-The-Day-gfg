// >> PYTHON CODE <<

class Solution:
    def countSubArrayProductLessThanK(self, a, n, k):
        
        i,j=0,0
        prod=1
        ans=0
        while j<n:
            prod*=a[j]
            
            
            while(i<=j and prod>=k):
                prod/=a[i]
                i+=1
            
            ans+=(j-i+1)
            j+=1
        
        return ans