//  >> JAVA CODE <<



public static int arrayOperations(int n, int[] arr) {
        
        int cnt=0;
        boolean flag=false;
        
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