#     >> PYTHON CODE <<


def nearestSmallestTower(self,arr):
        n=len(arr)
        
        stack=[]
        left=[-1]*n
        right=[n]*n
        
        stack.append(0)
        
        for i in range(1,n):
            while(len(stack)!=0 and arr[stack[-1]]>=arr[i]):
                stack.pop()
            
            if(len(stack)!=0): left[i]=stack[-1]
            else: left[i]=-1
            
            stack.append(i)
        

        stack=[]
        stack.append(n-1)
        for i in range(n-2,-1,-1):
            while(len(stack)!=0 and arr[stack[-1]]>=arr[i]):
                stack.pop()
            
            if(len(stack)!=0): right[i]=stack[-1]
            else: right[i]=n
        
            stack.append(i)
        
        #print(left, right)
        ans=[]
        
        for i in range(0,n):
            if(left[i]==-1 and right[i]==n):
                ans.append(-1)
            elif left[i]==-1:
                ans.append(right[i])
            elif right[i]==n:
                ans.append(left[i])
            elif i-left[i]==right[i]-i:
                if(arr[left[i]]<arr[right[i]]):
                    ans.append(left[i])
                elif arr[left[i]]==arr[right[i]]:
                    ans.append(min(left[i],right[i]))
                else:
                    ans.append(right[i])
            else:
                if(i-left[i]<right[i]-i):
                    ans.append(left[i])
                else:
                    ans.append(right[i])
            
        return ans