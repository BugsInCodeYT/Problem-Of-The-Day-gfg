#   >> PYTHON CODE <<


def findNumber(self, N : int) -> int:
        
        num=0
        lst=[9,1,3,5,7]
        x=1
        p=1
        while(N!=0):
            lastDigit=N%5
            num=num+lst[lastDigit]*p
            if(N%5==0):
                N-=1
            p*=10    
            N=N//5
            

        return num