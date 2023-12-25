#           >> PYTHON CODE <<


class Solution:
    
    #Function for finding determinant of matrix.
    def determinantOfMatrix(self,matrix,n):
        def solve(mat,N):
            if(N==1): return mat[0][0]
            
            ans=0
            sign=1
            for col in range(N):
                tempMatrix=[ [0 for _ in range(N-1)] for _ in range(N-1)]
                ti,tj=0,0
                for i in range(N):
                    for j in range(N):
                        if(i!=0 and j!=col):
                            tempMatrix[ti][tj]=mat[i][j]
                            tj+=1
                            if(tj==N-1):
                                ti+=1
                                tj=0
                    
                    
                #print(tempMatrix)
                ans+=sign*mat[0][col]*solve(tempMatrix,N-1)
                sign*=(-1)
            
            return ans
        
        return solve(matrix,n)