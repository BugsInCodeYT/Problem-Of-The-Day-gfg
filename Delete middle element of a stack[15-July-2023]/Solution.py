#  >> PYTHON CODE <<

class Solution:
    #Function to delete middle element of a stack.
    def deleteMid(self, s, sizeOfStack):
        def solve(s,sizeOfStack,midInd):
            if(sizeOfStack==0): return
        
            el=s.pop()
            solve(s,sizeOfStack-1,midInd)
            
            if(midInd!=sizeOfStack):
                s.append(el)
        
        solve(s,sizeOfStack,(sizeOfStack+1)//2)
