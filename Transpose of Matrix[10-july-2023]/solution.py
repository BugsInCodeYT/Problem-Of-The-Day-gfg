#  >> PYTHON CODE <<

class Solution:
    def transpose(self, matrix, n):
        for i in range(n):
            for j in range(i+1,n):
                #swap matrix[i][j] and matrix[j][i]
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
