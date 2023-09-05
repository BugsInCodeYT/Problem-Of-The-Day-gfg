//  >> JAVA CODE <<

class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        
        for(var edge:edges)
        {
            int u=edge[0],v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
            return adj;
    }
}