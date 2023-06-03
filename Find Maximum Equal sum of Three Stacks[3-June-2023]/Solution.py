#   >> PYTHON CODE <<

def maxEqualSum(self, N1:int,N2:int,N3:int, S1 : List[int], S2 : List[int], S3 : List[int]) -> int:
        ans=0
        
        sum1=sum(S1)
        sum2=sum(S2)
        sum3=sum(S3)
        
        i,j,k=0,0,0
        
        while(i<len(S1) and j<len(S2) and k<len(S3)):
            if(sum1==sum2 and sum2==sum3):
                return sum1
            
            if(max(sum1,sum2,sum3)==sum1):
                sum1-=S1[i]
                i+=1
            elif(max(sum1,sum2,sum3)==sum2):
                sum2-=S2[j]
                j+=1
            else:
                sum3-=S3[k]
                k+=1
        
        return 0