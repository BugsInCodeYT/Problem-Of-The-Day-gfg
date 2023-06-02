//  >> JAVA CODE <<

class Complete{
    
    static boolean[] store=new boolean[1299723];
    static ArrayList<Integer> primes=new ArrayList<>();
    public static void precompute () {
        
        for(int i=2;i<1299723;i++)
        {
            for(int j=i+i;j<1299723;j+=i)
            {
                store[j]=true;
            }
        }
        
        for(int i=2;i<1299723;i++)
        {
            if(store[i]==false)
            {
                primes.add(i);
            }
        }
    }
    
    public static void dfs(int i,ArrayList<ArrayList<Integer>> adj,int[] curCount,boolean[] visited)
    {
        if(visited[i]==true) return;
        
        visited[i]=true;
        
        curCount[0]+=1;
        
        for(int x: adj.get(i))
        {
            if(visited[x]==false) 
                dfs(x,adj,curCount,visited);
        }
    }
    public static int helpSanta (int n, int m, int g[][]) {
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<=n;i++)
            adj.add(new ArrayList<>());
            
        for(int i=0;i<g.length;i++)
        {
            int u=g[i][0],v=g[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        
        
        int maxGroupSize=0;
        
        boolean[] visited=new boolean[n+1];
        
        for(int i=0;i<=n;i++)
        {
            if(visited[i]==false){
                int[] curCount={0};
                dfs(i,adj,curCount,visited);
                maxGroupSize=Math.max(maxGroupSize,curCount[0]);
            }
        }
        
        if(maxGroupSize==1) return -1;
        
        return primes.get(maxGroupSize-1);
        
    }
    
    
}