//  >> C++ CODE <<

class Solution {
    // Function to check if placing 'num' at (row, col) is valid.
    public:
    bool isValid(int num, int grid[9][9], int row, int col) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == num) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == num) return false;
        }

        int rr = row - row % 3, cc = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[rr + i][cc + j] == num) return false;
            }
        }

        return true;
    }

    // Function to solve the Sudoku puzzle using backtracking.
    bool SolveSudoku(int grid[9][9]) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        if (isValid(k, grid, i, j)) {
                            grid[i][j] = k;
                            bool ans = SolveSudoku(grid);

                            if (ans) return true;  
                            else grid[i][j] = 0;
                        }
                    }

                    return false;
                }
            }
            
        }

            return true;
    }

    // Function to print the grids of the Sudoku.
    void printGrid(int grid[9][9]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                cout << grid[i][j] << " ";
        }
    }
};