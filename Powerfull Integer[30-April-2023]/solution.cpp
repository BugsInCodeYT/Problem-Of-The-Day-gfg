//   >> C++ CODE <<


int powerfullInteger(int n,vector<vector<int>> &intervals,int k){
        int mx=INT_MIN;
        for(int i=0;i<n;i++){
            mx=max(mx,intervals[i][1]);
        }
        vector<int>v(mx+3,0);
        for(int i=0;i<n;i++){
            v[intervals[i][0]]+=1;
            v[intervals[i][1]+1]-=1;
            
        }
        int ans=-1;
        for(int i=1;i<mx+3;i++){
             v[i]=v[i-1]+v[i];
             if(v[i]>=k) ans=i;
        }
        return ans;
    }