#    >> PYTHON CODE <<

from typing import List

class Solution:
    def is_possible_to_get_seats(self, n : int, m : int, seats : List[int]) -> bool:
        
        if(n>m): return False
        if(n==0): return True
        if(m==1): return seats[0]==0
        
        
        i=0
        
        while(i<m):
            if(seats[i]==0):
                if(i==0):
                    if(seats[i+1]!=1):
                        n-=1
                        if(n==0): return True
                        seats[i]=1
                elif i==m-1:
                    if(seats[i-1]!=1):
                        n-=1
                        if(n==0): return True
                        seats[i]=1
                else:
                    if(seats[i-1]!=1 and seats[i+1]!=1):
                        n-=1
                        if(n==0): return True
                        seats[i]=1
            i+=1

        return n==0
