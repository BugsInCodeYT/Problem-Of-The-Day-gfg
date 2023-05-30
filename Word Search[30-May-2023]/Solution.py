#  >> PYTHON CODE <<


class Solution:
	def isWordExist(self, board, word):
	    def valid(i,j,board,visited,word,ind):
	        if(i<0 or j<0 or i>=len(board) or j>=len(board[0])): return False
	        if(visited[i][j] or word[ind]!=board[i][j]): return False
	    
	        return True
	        
		def dfs(i,j,board,word,ind,visited):
		    if(ind==len(word)): return True
		    if(not valid(i,j,board,visited,word,ind)): return False
		  
		    visited[i][j]=True
		  
		    result=(dfs(i+1,j,board,word,ind+1,visited) or
		            dfs(i-1,j,board,word,ind+1,visited) or 
		            dfs(i,j+1,board,word,ind+1,visited) or 
		            dfs(i,j-1,board,word,ind+1,visited))

            visited[i][j]=False

            return result

        for i in range(len(board)):
            for j in range(len(board[0])):
                if(board[i][j]==word[0]):
                    visited = [[False] * len(board[0]) for _ in range(len(board))]
                    if(dfs(i,j,board,word,0,visited)): return True
    
    
    
        return False