def solve(self, N : int, A : List[int], B : List[int]) -> int:
   oddA,oddB,evenA,evenB=[], [], [], []
   sum1,sum2=0,0
        
   for numA,numB in zip(A,B):
      sum1+=numA
      sum2+=numB
            
      if numA%2==0:
        evenA.append(numA)
      else:
        oddA.append(numA)
            
      if numB%2==0:
        evenB.append(numB)
      else:
        oddB.append(numB)
        
        
      if sum1!=sum2 or len(evenA)!=len(evenB):
        return -1
        
      oddA.sort(), evenA.sort(), oddB.sort(), evenB.sort()
        
      ans=0
        
      for numA,numB in zip(evenA,evenB):
        ans+=abs(numA-numB)//2
        
      for numA,numB in zip(oddA,oddB):
        ans+=abs(numA-numB)//2
        
        
       return ans//2    
        