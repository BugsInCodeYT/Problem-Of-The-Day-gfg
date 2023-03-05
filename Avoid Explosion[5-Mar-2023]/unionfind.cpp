class Solution {
  public:
    vector<string> avoidExplosion(vector<vector<int>> mix, int n,
                                  vector<vector<int>> danger, int m) {
        vector<int> parent(n+1);
        vector<int> rank(n+1);
        for (int i = 0; i < n; i++){
            rank[i]=0;
            parent[i] = i;
        }
        
        vector<string> res;
        for (int i = 0; i < n; i++) {
            int x = mix[i][0], y = mix[i][1];
            int fx = find(x, parent), fy = find(y, parent);
            bool is_safe = true;
            for (int j = 0; j < m; j++) {
                int p = danger[j][0], q = danger[j][1];
                int fp = find(p, parent), fq = find(q, parent);
                if ((fx == fp && fy == fq) || (fx == fq && fy == fp)) {
                    is_safe = false;
                    break;
                }
            }
            res.push_back(is_safe ? "Yes" : "No");
            if (is_safe) union_(fx,fy,parent,rank);
        }
        
        return res;
    }

  private:
    int find(int x, vector<int>& ds) {
        if (ds[x] != x) ds[x] = find(ds[x], ds);
        return ds[x];
    }

    void union_(int x,int y,vector<int>& parent,vector<int>& rank) {
        if (rank[x] > rank[y]) {
            parent[y] = x;
            rank[x] += rank[y];
        } else {
            parent[x] = y;
            rank[y] += rank[x];
        }
    }
};
