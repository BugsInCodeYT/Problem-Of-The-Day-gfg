//   >> C++ CODE <<

class Solution {
public:
    bool isWordExist(vector<vector<char>>& board, string word) {
        vector<vector<bool>> visited(board.size(), vector<bool>(board[0].size(), false));
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board[0].size(); j++) {
                if (board[i][j] == word[0]) {
                    if (dfs(i, j, board, word, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
private:
    bool valid(int i, int j, vector<vector<char>>& board, vector<vector<bool>>& visited, string word, int ind) {
        if (i < 0 || j < 0 || i >= board.size() || j >= board[0].size()) {
            return false;
        }
        if (visited[i][j] || word[ind] != board[i][j]) {
            return false;
        }
        return true;
    }
    
    bool dfs(int i, int j, vector<vector<char>>& board, string word, int ind, vector<vector<bool>>& visited) {
        if (ind == word.length()) {
            return true;
        }
        if (!valid(i, j, board, visited, word, ind)) {
            return false;
        }
        visited[i][j] = true;
        bool result = dfs(i + 1, j, board, word, ind + 1, visited) ||
                      dfs(i - 1, j, board, word, ind + 1, visited) ||
                      dfs(i, j + 1, board, word, ind + 1, visited) ||
                      dfs(i, j - 1, board, word, ind + 1, visited);
        visited[i][j] = false;
        return result;
    }
};
