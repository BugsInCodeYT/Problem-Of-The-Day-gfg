//  >> C++ CODE <<

    vector<vector<int>> chefAndWells(int n,int m,vector<vector<char>> &grid){
        vector<vector<int>> ans(n,vector<int>(m,1e9));
        queue<pair<int,int>> q;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='W'){
                    q.push({i,j});
                    ans[i][j]=0;
                }
            }
        }
        int dx[4]={0,0,-1,1};
        int dy[4]={-1,1,0,0};
        while(q.size()){
            auto cur=q.front();
            q.pop();
            int curx=cur.first,cury=cur.second;
            for(int i=0;i<4;i++){
                int x=curx+dx[i],y=cury+dy[i];
                if(x>=0 and x<n and y>=0 and y<m and grid[x][y]!='N' and ans[x][y]>ans[curx][cury]+1){
                    q.push({x,y});ans[x][y]=ans[curx][cury]+1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='.') ans[i][j]=0;
                else if(ans[i][j]==1e9 and grid[i][j]!='N') ans[i][j]=-1;
                else if(ans[i][j]==1e9 and grid[i][j]!='H') ans[i][j]=0;
                else ans[i][j]*=2;
            }
        }
        return ans;
    }
