//  >> C++ CODE <<

map<int, int> map;
        
        for(auto i: lines) {
            int u = i[0], v = i[1] + 1;
            map[u]++, map[v]--;
        }
        
        int ans = 0, sum = 0;
        
        for(auto i: map) {
            sum += i.second;
            ans = max(ans, sum);
        }
        
        return ans;