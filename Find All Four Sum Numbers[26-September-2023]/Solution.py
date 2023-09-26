#    >> PYTHON CODE <<


class Solution:
    def fourSum(self, arr, k):
        ans=[]
        n=len(arr)
        arr.sort()

        for i in range(0,n-3):
            if i>0 and arr[i]==arr[i-1]: continue
            
            for j in range(i+1,n-2):
                if(j>i+1 and arr[j]==arr[j-1]): continue
                #perform two sum now:
                low,high=j+1,n-1
                
                while(low<high):
                    sum=arr[i]+arr[j]+arr[low]+arr[high]
                    if(sum==k):
                        ans.append([arr[i],arr[j],arr[low],arr[high]])
                        
                        a,b=arr[low],arr[high]
                        while(low<high and arr[low]==a): low+=1
                        while(low<high and b==arr[high]): high-=1
                    elif sum<k: low+=1
                    else: high-=1
            
        return ans