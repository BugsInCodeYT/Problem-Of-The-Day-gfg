//			>> C++ CODE <<

long long int no_of_subarrays(int n, vector<int> &arr) {
    	  long ans = 0;
        long cnt = 0;

	  // count the continuous 0's
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                cnt++;
            } else {
                ans += ((long)(cnt*(cnt+1))/2);
                cnt = 0;
            }
        }

        if(cnt != 0) {
            ans += ((long)(cnt*(cnt+1))/2);
        }

        return ans;
}