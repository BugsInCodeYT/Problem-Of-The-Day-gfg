//    >> C++ CODE <<


int totalTime(int n, vector<int> arr, vector<int> time) {
        unordered_map<int, int> map;
        map[arr[0]] = 0LL;
        int ctime = 0LL;
        
        for(int i = 1; i < n; i++) {
            int lastEncountered = map.count(arr[i]) ? map[arr[i]] : -1LL;
            
            if(lastEncountered == -1) {
                ctime += 1LL;
            } else {
                if((ctime - lastEncountered) >= time[arr[i] - 1]) {
                    ctime++;
                } else {
                    ctime += (time[arr[i] - 1] - (ctime - lastEncountered));
                }
            }
            
            map[arr[i]] = ctime;
        }
        
        return ctime;
    }