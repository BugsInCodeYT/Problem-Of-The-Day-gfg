#  >> PYTHON CODE < 


def arrayOperations(self, n : int, arr : List[int]) -> int:
    
    cnt=0
    flag=False
    for i in range(n):
        if(arr[i]!=0):
            if(not flag): cnt+=1
            flag=True
        else:
            flag=False
        
    return cnt