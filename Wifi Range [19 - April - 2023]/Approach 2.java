//   >> JAVA CODE <<


boolean wifiRange(int N, String S, int X) 
    { 
        int[] visited = new int[N];
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                int start = Math.max(i - X, 0);
                int end =i + X;
                visited[start] += 1;
                if (end + 1 < N) {
                    visited[end + 1] += -1;
                }
            }
        }
        
        for(int i=1;i<N;i++) visited[i]+=visited[i-1];
        
        
        for (int val : visited) {
            if (val==0) {
                return false;
            }
        }
        
        return true;
    }