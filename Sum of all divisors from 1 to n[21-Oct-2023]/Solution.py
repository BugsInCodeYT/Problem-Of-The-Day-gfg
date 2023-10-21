#    >> PYTHON CODE <<


class Solution:
    def sumOfDivisors(self, N):
         sum=0
    	 for i in range(1,N+1):
    	     sum+=i*(N//i)
    	     
    	 return sum
