#  >> PYTHON CODE <<

class Solution:
    def isLucky(self, n):
        def check(n,i):
            if(n<i): return True
            if(n%i==0): return False
            
            return check(n-n//i,i+1)
        
        return check(n,2)
