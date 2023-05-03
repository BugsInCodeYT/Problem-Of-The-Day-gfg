from typing import List
from collections import defaultdict

class Solution:
    

    def makePalindrome(self,n, arr):
        def palindrome(str):
            low=0
            high=len(str)-1
            
            while(low<high):
                if(str[low]!=str[high]):
                    return False
                low+=1
                high-=1
            
            return True
            
        mp = defaultdict(int)
        
        for i in range(n):
            str = arr[i]
            if str in mp:
                mp[str] += 1
            else:
                mp[str] = 1
        
        onePalin=""
        for i in range(n):
            if(not palindrome(arr[i])):
                str = arr[i]
                rev = str[::-1]
        
                if (mp[str] != mp[rev]):
                        return False
            else:
                if(onePalin==""):
                     onePalin=arr[i]
                if(onePalin!=arr[i]):
                       return False
                
        return True
