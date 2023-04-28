//  >> JAVA CODE <<
            
    public int[][] chefAndWells(int m,int n,char arr[][])
    {
        
        int dir[][] = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int res[][] = new int[m][n];
        for(int r[] : res) Arrays.fill(r, Integer.MAX_VALUE);
        
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(arr[i][j] == 'W'){
                    res[i][j] = 0;
                    q.add(new int[]{i, j, 0});
                }
            }
        }
        
        while(!q.isEmpty()){
            int curr[] = q.poll();
            
            for(int i = 0;i<4;i++){
                int r = curr[0]+dir[i][0],  c = curr[1]+dir[i][1]; 
                if(r>=0 && c>=0 && r<m && c<n && (arr[r][c] == 'H' || arr[r][c] == '.')){
                    if(res[r][c]>curr[2]+2){
                        res[r][c] = curr[2]+2;
                        q.add(new int[]{r, c, curr[2]+2});
                    }
                }
            }
        }
        
        
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                
                if(res[i][j] == Integer.MAX_VALUE) res[i][j] = -1;
                if(arr[i][j] == '.' || arr[i][j] == 'N'){
                    res[i][j] = 0;
                }
            }
        }
        return res;
        
    }