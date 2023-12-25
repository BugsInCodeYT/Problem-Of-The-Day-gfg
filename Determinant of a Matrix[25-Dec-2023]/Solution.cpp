//         >> CPP CODE <<

class Solution
{   
    public:
    //Function for finding determinant of matrix.
    int solve(vector<vector<int>> matrix, int n) {
        if (n == 1) return matrix[0][0];

        int ans = 0, sign = 1;

        for (int col = 0; col < n; col++) {
            vector<vector<int>> temp(n - 1, vector<int>(n - 1));
            int ti = 0, tj = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != 0 && j != col) {
                        temp[ti][tj++] = matrix[i][j];
                        if (tj == n - 1) {
                            ti++;
                            tj = 0;
                        }
                    }
                }
            }

            ans += sign * matrix[0][col] * solve(temp, n - 1);
            sign *= -1;
        }

        return ans;
    }
    int determinantOfMatrix(vector<vector<int> > matrix, int n)
    {
        return solve(matrix, n);
    }
};