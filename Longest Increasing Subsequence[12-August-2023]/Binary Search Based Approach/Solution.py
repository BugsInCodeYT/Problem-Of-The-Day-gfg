#  >> PYTHON CODE <<

class Solution:
    
    #Function to find length of longest increasing subsequence.
    def lowerbound(self,a,x):
        low,high=0,len(a)-1
        
        ans=-1
        
        while(low<=high):
            mid=(low+high)//2
            
            if(a[mid]>=x):
                ans=mid
                high=mid-1
            else:
                low=mid+1
        
        return ans
            
    def longestSubsequence(self,a,n):
        ans=[]
        
        ans.append(a[0])
        
        for i in range(1,n):
            if(ans[len(ans)-1]<a[i]):
                ans.append(a[i])
            else:
                ind=self.lowerbound(ans,a[i])
                ans[ind]=a[i]
            
        
        return len(ans)
   