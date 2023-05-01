#  >> PYTHON CODE <<


def maxSweetness(self, sweetness, n, k):
        def good(x,sweetness,k):
            n=len(sweetness)
            s,cnt=0,0
            
            for i in range(0,n):
                s+=sweetness[i]
                if(s>=x):
                    s=0
                    cnt+=1
            
            return cnt>=k+1
            
        low,high=0,1e9
        ans=-1
        
        while(low<=high):
            mid=(low+high)//2
            if(good(mid,sweetness,k)):
                low=mid+1
                ans=mid
            else:
                high=mid-1

        return int(ans)