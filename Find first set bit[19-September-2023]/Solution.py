#    >> PYTHON CODE <<

    def getFirstSetBit(self,n):
        pos=1
        
        while(n != 0):
            bit=n%2
            
            if(bit==1): return pos
            pos+=1
            n/=2
        
        return 0