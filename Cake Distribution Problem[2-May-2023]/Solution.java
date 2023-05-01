//  >> JAVA CODE <<

private boolean good(int x, int[] sweetness, int n, int k) {
     int s = 0, cnt = 0;
     for (int i = 0; i < n; i++) {
         s += sweetness[i];
         if (s >= x) {
             s = 0;
             cnt++;
         }
     }
     return cnt >= k + 1;
    }
	int maxSweetness(int [] sweetness, int N, int K) {
	    int low = 0, high = 1000000000, ans = -1;
	    
    while (low <= high) {
        int mid = (low + high) / 2;
        if (good(mid, sweetness,N,K)) {
            low = mid + 1;
            ans = mid;
        } else {
            high = mid - 1;
        }
    }

    return ans;
	}