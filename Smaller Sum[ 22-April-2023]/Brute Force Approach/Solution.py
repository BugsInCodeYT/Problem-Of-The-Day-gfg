# >> PYTHON CODE <<


def smallerSum(self, n : int, arr : List[int]) -> List[int]:
        
     ans=[]
        
     for val in arr:
         cnt=0
         for val2 in arr:
             if(val2<val):
                 cnt+=val2
            
         ans.append(cnt)
            
        
     return ans