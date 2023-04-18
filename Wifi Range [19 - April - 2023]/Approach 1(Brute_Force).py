#      >> PYTHON CODE <<


visited=[False]*N
        
        for i in range(0,N):
            if(S[i]=='1'):
                for j in range(max(0,i-X),min(i+X,N-1)+1):
                    visited[j]=True
        
        for val in visited:
            if val is False:
                return False
        
        return True