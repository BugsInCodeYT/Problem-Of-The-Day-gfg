//		>> C++ CODE <<

int countSpecialNumbers(int N, vector<int> arr) {
        unordered_map<int, bool> map;

    vector<bool> res(N, false);
    
    for(int i = 0; i < N; i++) {
        if(map.count(arr[i])){ 
            res[i] = map[arr[i]];
            continue;
        }
        
        for(int j = 0; j < N; j++) {
            if(i != j && arr[i] % arr[j] == 0){
                res[i] = true;
                break;
            }
        }
        
        map[arr[i]] = res[i];
    }
    
    int ans = 0;
    
    for(int i = 0; i < N; i++) {
        if(res[i]) {
            ans++;
        }
    }
    
    return ans;
        
        
        
    }