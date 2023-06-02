#  >> PYTHON CODE <<

import sys
sys.setrecursionlimit(10**6)

class Solution:
    maxn = 1299723
    store = [0]*(maxn+1)
    primes = [2];

    def precompute(self):
        for i in range(1, self.maxn+1):
            self.store[i] = 1

        self.store[0] = 0
        self.store[1] = 0

        i = 2
        while i*i<=self.maxn:
            if(self.store[i]==1):
                j = i*i
                while j<=self.maxn:
                    self.store[j] = 0
                    j+=i
            i+=1

        for i in range(3, self.maxn+1):
            if(self.store[i]):
                self.primes.append(i)
      
           
    def helpSanta (self, n, m, g) : 
        
        visited=[0]*(n+1)
        maxGroupCount=0
        
        for i in range(1,n+1):
            if not visited[i]:
                curCount=1
                
                #performing BFS
                queue=[]
                visited[i]=1
                queue.append(i)
                
                while(len(queue)>0):
                    nn=queue.pop(0)
                    
                    for x in g[nn]:
                        if not visited[x]:
                            visited[x]=1
                            queue.append(x)
                            curCount+=1
                
                
                maxGroupCount=max(maxGroupCount,curCount)
        
        if(maxGroupCount==0 or maxGroupCount==1): return -1
        
        return self.primes[maxGroupCount-1]
