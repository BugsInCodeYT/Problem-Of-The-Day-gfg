//  >> C++ CODE <<


int arrayOperations(int n, vector<int> &arr) {
        int cnt=0;
        bool flag=false,allNonZero=true;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                if(flag==false) cnt++;
                flag=true;
            }
            else
            {
                allNonZero=false;
                flag=false;
            }
        }
        
        if(allNonZero) return -1;
        
            return cnt;
    }
