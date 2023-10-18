//   >> JAVA CODE <<

class Solution {

    public boolean dfs(int i,List<List<Integer>> adj,boolean[] visited,boolean[] rec,boolean[] presentCycle)
    {
        if(rec[i]) return presentCycle[i]=true;   
        if(visited[i]) return false;
        
        visited[i]=true;
        rec[i]=true;
        
        for(Integer in:adj.get(i))
        {
            if(dfs(in,adj,visited,rec,presentCycle)) return presentCycle[i]=true;
        }
        
        rec[i]=false;
        
            return false;
    }
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        boolean[] visited=new boolean[V];
        boolean[] rec=new boolean[V];
        boolean[] presentCycle=new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                dfs(i,adj,visited,rec,presentCycle);
            }
        }
        
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<V;i++)
        {
            if(presentCycle[i]==false)
            {
                ans.add(i);
            }
        }

            return ans;
    }
}