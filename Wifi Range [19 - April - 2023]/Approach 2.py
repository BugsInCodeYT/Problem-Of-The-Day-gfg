#    >> PYTHON CODE <<       

       visited=[0]*N
       
       for i in range(0,N):
           if(S[i]=='1'):
               visited[max(i-X,0)]+=1
               if i+X+1<N:
                 visited[i+X+1]+=-1
       
       for i in range(1,N):
            visited[i]+=visited[i-1]
       
       for val in visited:
            if val == 0:
                return False
        
       return True