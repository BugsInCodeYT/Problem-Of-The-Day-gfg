//   >> JAVA CODE <<


public static int bitMagic(int n, int[] arr) {
        int low=0,high=arr.length-1;
        int cnt=0;
        while(low<high)
        {
            if(arr[low]!=arr[high])
                cnt++;
            
            low++; high--;
        }
        
        return cnt%2==0?cnt/2:cnt/2+1;
    }