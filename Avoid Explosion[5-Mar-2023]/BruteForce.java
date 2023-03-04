class Solution {
    boolean solve(int u,int v,ArrayList<ArrayList<Integer>>graph,boolean[] visited)
    {
        if(u==v) return true;
        
        boolean ans=false;
        
        visited[u]=true;
        
        for(Integer in:graph.get(u))
        {
            if(visited[in]==false)
                ans=ans || solve(in,v,graph,visited);
        }
        
            return ans;
    }
    boolean pathExists(int u,int v,ArrayList<ArrayList<Integer>> graph)
    {
        boolean[] visited=new boolean[graph.size()+1];
        
        return solve(u,v,graph,visited);
    }
    ArrayList<String> avoidExlosion(int mix[][], int n, int danger[][], int m) {
        
        int[] parent=new int[n+1];
        int[] rank=new int[n+1];
        
        for(int i=0;i<=n;i++){
            parent[i]=i;
            rank[i]=0;
        }
        
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        
        for(int i=0;i<=n;i++) graph.add(new ArrayList<>());
        
        ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            int x=mix[i][0],y=mix[i][1];
            
            
                graph.get(x).add(y);
                graph.get(y).add(x);
            
            
            boolean safe=true;
            
            for(int[] dd:danger)
            {
                int u=dd[0],v=dd[1];
                
                if(pathExists(u,v,graph)) 
                {
                    safe=false;
                    break;
                }
            }
            
            ans.add(safe?"Yes":"No");
            if(!safe){ 
                graph.get(x).remove(graph.get(x).size()-1);
                graph.get(y).remove(graph.get(y).size()-1);
            }
        }
        
            return ans;
    }
}