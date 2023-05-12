#  >> PYTHON CODE < 


class Solution:
    def arrayOperations(self, n : int, arr : List[int]) -> int:
    
        cnt=0
        flag=False
        allNonZero=True
        for i in range(n):
            if(arr[i]!=0):
                if(not flag): cnt+=1
                flag=True
            else:
                allNonZero=False
                flag=False
        
        if(allNonZero):
            return -1
            
        return cnt
