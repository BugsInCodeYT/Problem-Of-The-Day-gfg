#  >> PYTHON CODE <<

class Solution:
    def colName (self, n):
        
        ans=""
        
        while(n!=0):
            n-=1
            char=chr(n%26+ord('A'))
            ans=char+ans
            
            n//=26
        
        return ans
