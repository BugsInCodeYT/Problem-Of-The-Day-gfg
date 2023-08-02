//  >> C++ CODE <<



class Solution {
  public:
    int shortestDistance(int N, int M, vector<vector<int>> A, int X, int Y) {
        
        if(A[0][0]==0) return -1;
        queue<pair<int,int>> q;
        vector<vector<bool>> vis(N,vector<bool>(M,false));
        int path=0;
        q.push({0,0});
        vis[0][0]=true;
        while(!q.empty()) {
            int size=q.size();
            for(int i=0;i<size;i++) {
                auto cur=q.front();
                q.pop();
                if(cur.first==X && cur.second==Y) return path;
                if(cur.first+1<N && !vis[cur.first+1][cur.second] && A[cur.first+1][cur.second]==1) {
                    q.push({cur.first+1,cur.second});
                    vis[cur.first+1][cur.second]=true;
                }
                if(cur.first-1>=0 && !vis[cur.first-1][cur.second] && A[cur.first-1][cur.second]==1) {
                    q.push({cur.first-1,cur.second});
                    vis[cur.first-1][cur.second]=true;
                }
                if(cur.second+1<M && !vis[cur.first][cur.second+1] && A[cur.first][cur.second+1]==1) {
                    q.push({cur.first,cur.second+1});
                    vis[cur.first][cur.second+1]=true;
                }
                if(cur.second-1>=0 && !vis[cur.first][cur.second-1] && A[cur.first][cur.second-1]==1) {
                    q.push({cur.first,cur.second-1});
                    vis[cur.first][cur.second-1]=true;
                }
            }
            path++;
        }
        return -1;
        
    }

};