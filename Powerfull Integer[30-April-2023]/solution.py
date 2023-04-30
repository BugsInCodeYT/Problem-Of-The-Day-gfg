#   >> PYTHON CODE <<

from typing import List


class Solution:
    def powerfullInteger(self,n,intervals,k):
        mp={}
        for start,end in intervals:
            if start not in mp:
                mp[start]=0
            if end+1 not in mp:
                mp[end+1]=0
            mp[start]+=1
            mp[end+1]-=1
        v=-1
        temp=0
        for el in sorted(mp.keys()):
            if mp[el]>=0:
                    
                temp+=mp[el]
                if temp>=k:
                    v=el
            else :
                if temp>=k:
                    v=el-1
                temp+=mp[el]
        return v