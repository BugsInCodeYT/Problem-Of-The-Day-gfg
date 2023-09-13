#  >> PYTHON CODE <<

class Solution:
    def findLargest(self, N, S):
        if(S>N*9 or (S==0 and N>1)): return '-1'
        num=""
        
        while(S>=9):
            num+="9" 
            N-=1
            S-=9
        
        while(N>0):
            if(S!=0):
                num+=str(S)
                S=0
            else: num+="0"
            N-=1

        return num
