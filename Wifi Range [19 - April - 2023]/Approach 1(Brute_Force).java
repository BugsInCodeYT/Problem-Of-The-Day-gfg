//   >> JAVA CODE <<


boolean wifiRange(int N, String S, int X) 
    { 
        boolean[] visited = new boolean[N];
        Arrays.fill(visited, false);
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                for (int j = Math.max(0, i - X); j <= Math.min(i + X, N - 1); j++) {
                    visited[j] = true;
                }
            }
        }
        for (boolean val : visited) {
            if (val == false) {
                return false;
            }
        }
        return true;
    }