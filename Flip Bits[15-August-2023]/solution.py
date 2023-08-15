#  >> PYTHON CODE <<

class Solution:
    def maxOnes(self, a, n):
        sum,mx=0,0
        cnt1=0
        
        for i in range(n):
            sum+=1 if a[i]==0 else (-1)
            
            if(a[i]==1): cnt1+=1
            
            mx=max(mx,sum)
            
            if(sum<0): sum=0
            
        return cnt1+mx    