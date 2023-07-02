# >>   BRUTE FORCE APPROACH <<

def getIntegerFromBinary(n):
            power=1
            num=0
            for i in range(31,-1,-1):
                num=num+n[i]*power
                power*=2
            
            return num
                
        def getBinaryRepresentation(n):
            binary=[0]*32
            
            i=31
            while(n!=0):
                rem=n%2
                binary[i]=rem
                i-=1
                n=n//2
            
            return binary
            
        binary_x=getBinaryRepresentation(x)
        binary_y=getBinaryRepresentation(y)
        
        start=32-r
        end=32-l
        
        for i in range(start,end+1):
            if(binary_y[i]==1):
                binary_x[i]=binary_y[i]
        
        
        return getIntegerFromBinary(binary_x)