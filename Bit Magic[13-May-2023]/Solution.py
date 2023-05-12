#  >> PYTHON CODE <<


def bitMagic(self, n : int, arr : List[int]) -> int:
    i,j=0,len(arr)-1
    
    cnt=0
    
    while(i<j):
        if(arr[i]!=arr[j]): cnt+=1
        i+=1
        j-=1
    
    if(cnt%2==0): return cnt//2 
    
    return cnt//2+1