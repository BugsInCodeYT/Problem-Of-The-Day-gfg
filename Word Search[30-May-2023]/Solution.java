   //   >> JAVA CODE <<

class Solution {
    public boolean isWordExist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(i, j, board, word, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean valid(int i, int j, char[][] board, boolean[][] visited,String word, int ind) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }
        if (visited[i][j] || word.charAt(ind) != board[i][j]) {
            return false;
        }
        return true;
    }
    
    private boolean dfs(int i, int j, char[][] board, String word, int ind, boolean[][] visited) {
        if (ind == word.length()) {
            return true;
        }
        if (!valid(i, j, board, visited,word, ind)) {
            return false;
        }
        visited[i][j] = true;
        boolean result = dfs(i + 1, j, board, word, ind + 1, visited) ||
                         dfs(i - 1, j, board, word, ind + 1, visited) ||
                         dfs(i, j + 1, board, word, ind + 1, visited) ||
                         dfs(i, j - 1, board, word, ind + 1, visited);

        return result;
    }
}
