//    >> C++ CODE <<


bool isValid(int i, int j, vector<vector<int>>& arr, vector<vector<bool>>& visited) {
        int n = arr.size(), m = arr[0].size();
        if (i < 0 || j < 0 || i >= n || j >= m || visited[i][j]) return false;
        return true;
    }
    
    int knightInGeekland(int start_x, int start_y,vector<vector<int>>& arr ) {
        
        int moves_x[] = {-2, -2, -1, -1, 1, 1, 2, 2};
        int moves_y[] = {-1, 1, -2, 2, 2, -2, 1, -1};
    
        
        int n = arr.size(), m = arr[0].size();
        queue<pair<int, int>> q;
        q.push(make_pair(start_x, start_y));
        vector<vector<bool>> visited(n, vector<bool>(m, false));
        visited[start_x][start_y] = true;
        vector<int> points;
        while (!q.empty()) {
            int size = q.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                pair<int, int> coor = q.front();
                q.pop();
                int curX = coor.first;
                int curY = coor.second;
                sum += arr[curX][curY];
                for (int index = 0; index < 8; index++) {
                    int xIndex = moves_x[index] + curX;
                    int yIndex = moves_y[index] + curY;
                    if (isValid(xIndex, yIndex, arr, visited)) {
                        visited[xIndex][yIndex] = true;
                        q.push(make_pair(xIndex, yIndex));
                    }
                }
            }
            points.push_back(sum);
        }
        vector<int> pointsArr(points.size());
        for (int i = 0; i < points.size(); i++) {
            pointsArr[i] = points[i];
        }
        int max = INT_MIN;
        int ans = 0;
        for (int i = points.size() - 1; i >= 0; i--) {
            if (pointsArr[i] + i < points.size()) {
                pointsArr[i] += pointsArr[pointsArr[i] + i];
            }
            if (pointsArr[i] >= max) {
                max = pointsArr[i];
                ans = i;
            }
        }
        return ans;
    }