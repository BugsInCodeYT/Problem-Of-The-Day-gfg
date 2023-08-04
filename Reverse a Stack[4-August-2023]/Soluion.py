#  >> Python Code <<

from typing import List
import sys

sys.setrecursionlimit(10000000)

class Solution:
    
    def reverse(self,St): 
        def insertAtLast(St,val):
            if(len(St)==0):
                St.append(val)
                return
            
            el=St.pop(len(St)-1)
            insertAtLast(St,val)
            St.append(el)
            
        if(len(St)==0): return;
        
        el=St.pop(len(St)-1)
        self.reverse(St)
        
        insertAtLast(St,el)
