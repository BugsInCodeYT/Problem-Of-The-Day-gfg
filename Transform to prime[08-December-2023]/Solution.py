#    >> PYTHON CODE <<

MAX=1000001
primes=[True]*MAX
primes[1]=False
for i in range(2,int(MAX**(0.5))+1):
    if(primes[i]):
        for j in range(2*i,MAX,i):
            primes[j]=False

class Solution:
            
    
    def minNumber(self, arr,n):

        sm=sum(arr)

        st=sm
        
        while(primes[st]==False): st+=1
        
        return int(st-sm)
