#  >> PYTHON CODE <<

def reverseEqn(self, s):
        
    i=len(s)-1
    ans=""
    while(i>=0):
        
        num=int(s[i])
            
        j=i-1
        while(j>=0 and s[j]>='0' and s[j]<='9'):
            num=num+int(s[j])*10
            j-=1
    
    
        ans=ans+str(num)
        
        while(j>=0 and (s[j]<'0' or s[j]>'9')):
            ans+=s[j]
            j-=1
            
        i=j
        
    return ans