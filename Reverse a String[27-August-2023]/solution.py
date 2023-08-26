#  >> PYTHON CODE <<

class Solution:
    def reverseWord(self,s):
        ans=""
        
        for i in range(len(s)-1,-1,-1):
            ans+=s[i]
        
        return ans