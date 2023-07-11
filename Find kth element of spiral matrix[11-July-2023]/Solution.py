#  >> PYTHON CODE <<

class Solution:
    def findK(self, a, n, m, k):
        
        rowSt,colSt,rowEnd,colEnd=0,0,n-1,m-1
        
        while(rowSt<n and colSt<m):
            for i in range(colSt,colEnd+1):
                #print(a[rowSt][i],end=" ")
                k-=1
                if(k==0):
                    return a[rowSt][i]
            
            rowSt+=1
            
            for i in range(rowSt,rowEnd+1):
                #print(a[i][colEnd],end=" ")
                k-=1
                if(k==0):
                    return a[i][colEnd]
            
            colEnd-=1
            
            for i in range(colEnd,colSt-1,-1):
                #print(a[rowEnd][i],end=" ")
                k-=1
                if(k==0):
                    return a[rowEnd][i]
            
            rowEnd-=1
            
            for i in range(rowEnd,rowSt-1,-1):
                #print(a[i][colSt],end=" ")
                k-=1
                if(k==0):
                    return a[i][colSt]
            
            colSt+=1

        return -1