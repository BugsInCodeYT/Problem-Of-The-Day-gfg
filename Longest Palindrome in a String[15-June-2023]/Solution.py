#  >> PYTHON CODE <<

def longestPalin(self, S):
        st=0
        end=0
        i=0
        n=len(S)
        while(i<n):
            j=i-1
            k=i+1
            
            while(j>=0 and k<n and S[j]==S[k]):
                k+=1
                j-=1
            
            if(k-j+1>end-st+1):
                end=k
                st=j
            
            j=i
            k=i+1
            
            while(j>=0 and k<n and S[j]==S[k]):
                k+=1
                j-=1
            
            if(k-j+1>end-st+1):
                end=k
                st=j
            
            i+=1
            
        
        return S[st+1:end]