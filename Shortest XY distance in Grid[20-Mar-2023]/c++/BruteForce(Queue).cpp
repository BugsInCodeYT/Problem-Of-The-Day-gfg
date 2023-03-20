//		>> QUEUE BASED APPROACH


class Solution {
public:
    static void bfs(vector<int>& cor, vector<vector<char>>& grid, int N, int M, int& ans)
    {
        vector<vector<bool>> visited(N, vector<bool>(M, false));
        queue<vector<int>> q;
        q.push({ cor[0], cor[1] });

        while (!q.empty())
        {
            vector<int> nn = q.front();
            q.pop();

            int x = nn[0], y = nn[1];

            if (x + 1 < N && visited[x + 1][y] == false)
            {
                visited[x + 1][y] = true;
                if (grid[x + 1][y] == 'O')
                    q.push({ x + 1, y });
                else if (grid[x + 1][y] == 'Y')
                {
                    int distance = abs(x + 1 - cor[0]) + abs(y - cor[1]);
                    ans = min(ans, distance);
                }
            }
            if (x - 1 >= 0 && visited[x - 1][y] == false)
            {
                visited[x - 1][y] = true;
                if (grid[x - 1][y] == 'O')
                    q.push({ x - 1, y });
                else if (grid[x - 1][y] == 'Y')
                {
                    int distance = abs(x - 1 - cor[0]) + abs(y - cor[1]);
                    ans = min(ans, distance);
                }
            }
            if (y + 1 < M && visited[x][y + 1] == false)
            {
                visited[x][y + 1] = true;
                if (grid[x][y + 1] == 'O')
                    q.push({ x, y + 1 });
                else if (grid[x][y + 1] == 'Y')
                {
                    int distance = abs(x - cor[0]) + abs(y + 1 - cor[1]);
                    ans = min(ans, distance);
                }
            }
            if (y - 1 >= 0 && visited[x][y - 1] == false)
            {
                visited[x][y - 1] = true;
                if (grid[x][y - 1] == 'O')
                    q.push({ x, y - 1 });
                else if (grid[x][y - 1] == 'Y')
                {
                    int distance = abs(x - cor[0]) + abs(y - 1 - cor[1]);
                    ans = min(ans, distance);
                }
            }
        }
    }

    static int shortestXYDist(vector<vector<char>>& grid, int N, int M)
    {
        int ans = INT_MAX;
        vector<vector<int>> list;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                char ch = grid[i][j];
                if (ch == 'X') list.push_back({ i, j });
            }
        }

        for (auto& coordinates : list)
        {
            bfs(coordinates, grid, N, M, ans);
        }

        return ans;
    }
};