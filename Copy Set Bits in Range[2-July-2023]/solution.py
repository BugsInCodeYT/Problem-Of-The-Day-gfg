//  >> PYTHON CODE <<

class Solution:
    def setSetBit(self, x, y, l, r):
        for i in range(l,r+1):
            if y & (1<<(i-1)):
                x=x|(1<<(i-1))
                
        return x