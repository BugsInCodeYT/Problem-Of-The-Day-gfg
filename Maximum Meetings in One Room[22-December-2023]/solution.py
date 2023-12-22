#         >> PYTHON CODE <<

from typing import List

class Pair:
        def __init__(self,a,b,c):
            self.a=a
            self.b=b
            self.c=c
        def __str__(self):
            return str(self.a)+" "+str(self.b)
class Solution:
    def maxMeetings(self, N : int, S : List[int], F : List[int]) -> List[int]:
        meetings=[Pair(S[i],F[i],i+1) for i in range(N)]
       
        meetings.sort(key=lambda x:x.b)
       
        ans=[]
        prev=Pair(-1,-1,-1)
        for i in range(N):
            if(i==0):
                ans.append(meetings[i].c)
                prev=meetings[i]
            else:
                if(meetings[i].a>prev.b):
                    ans.append(meetings[i].c)
                    prev=meetings[i]
        
       
        ans.sort()
        return ans