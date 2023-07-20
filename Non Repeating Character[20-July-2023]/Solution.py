#  >> PYTHON CODE <<

class Solution:
    
    #Function to find the first non-repeating character in a string.
    def nonrepeatingCharacter(self,s):
        
        n=len(s)
        freq=[0]*26
        
        for i in range(n):
            freq[ord(s[i])-ord('a')]+=1
        
        for i in range(n):
            if(freq[ord(s[i])-ord('a')]==1):
                return s[i]
        
        return '$'
    
  