class Solution:
    def CamelCase(self,N,Dictionary,Pattern):
        ans=[]
        
        for word in Dictionary:
            st=""
            flag=False
            for char in word:
                if(char>="A" and char<="Z"):
                    st+=char
            
                if(st==Pattern):
                    flag=True
                    break
            
              
            if(flag==True):  
                print(ans)  
                ans.append(word)
        
        if(len(ans)==0):
            ans.append("-1")
        
        return ans        