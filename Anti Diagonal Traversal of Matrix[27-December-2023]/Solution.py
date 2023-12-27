#           >> PYTHON CODE <<


class Solution:
    def antiDiagonalPattern(self,matrix):
        mp={}
        n=len(matrix)
        for i in range(n):
            for j in range(n):
                if (i+j) not in mp:
                    mp[i+j]=[]
                mp[i+j].append(matrix[i][j])
        
        
        ans=[]
        
        for i in range(2*(n-1)+1):
            lst=mp[i]
            for value in lst:
                ans.append(value)
        
        return ans