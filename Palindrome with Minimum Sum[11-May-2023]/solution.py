#   >> PYTHON CODE << 




class Solution:
    def minimumSum(self, s : str) -> int:
        def possible(s):
            low,high=0,len(s)-1
            
            while(low<high):
                if(s[low] !='?' and s[high]!='?' and s[low]!=s[high]):
                    return False
                    
                low+=1
                high-=1
                
            return True
        
        def solve(st):
            s=list(st)
            i=0
            
            low,high=0,len(s)-1
            
            while(low<high):
                if(s[low]=='?'): s[low]=s[high]
                elif(s[high]=='?'): s[high]=s[low]
                low+=1
                high-=1
            
            #print(s)
            while(i<len(s) and s[i]=='?'): i+=1
            
            if(i==len(s)): return 0
            
            ans=0
            prev=s[i]
            for x in range(i,len(s)):
                if(s[x]=='?'):
                    s[x]=prev
                
                #print(abs(ord(s[x])-ord(prev)))
                ans+=abs(ord(s[x])-ord(prev))
                prev=s[x]
            
            return ans
            
        if not possible(s):
            return -1
        else:
            return solve(s)
     