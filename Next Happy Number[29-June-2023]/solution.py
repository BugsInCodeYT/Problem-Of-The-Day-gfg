#  >> PYTHON CODE <<

def nextHappy (self, N):
    def isHappy(n):
        mp={}
        
        while(n not in mp):
            mp[n]=1
            sum=0
            
            while(n>0):
                digit=n%10
                sum+=digit*digit
                n=n//10
            
            if(sum==1): return True
            n=sum
            
        return False
    
    N+=1
    while(1):
        if(isHappy(N)):
            return N
        N+=1