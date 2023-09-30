#  >> PYTHON CODE <<

def booleanMatrix(matrix):
    n,m=len(matrix),len(matrix[0])
    
    rows=[False]*n
    cols=[False]*m

    for i in range(n):
        for j in range(m):
            if(matrix[i][j]==1):
                rows[i]=True
                cols[j]=True
    
    for i in range(n):
        for j in range(m):
            if(rows[i] or cols[j]):
                matrix[i][j]=1