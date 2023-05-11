//  >> C++ CODE <<


int arrayOperations(int n, vector<int> &arr) {
        int cnt=0;
        bool flag=false;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                if(flag==false) cnt++;
                flag=true;
            }
            else
            {
                flag=false;
            }
        }
        
            return cnt;
    }