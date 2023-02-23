

//User function Template for Java

class Solution {
    static int[] dijkstra(int a,int n,ArrayList<ArrayList<ArrayList<Integer>>> graph)
    {
        int[] dist=new int[n+1];
        
        boolean[] visited=new boolean[n+1];
        Arrays.fill(dist,(int)1e9);
        dist[a]=0;
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->{
            return x[0]-y[0];
        });
        
        pq.add(new int[]{0,a});
        
        while(!pq.isEmpty())
        {
            int u=pq.poll()[1];
            visited[u]=true;
            
            for(ArrayList<Integer> al:graph.get(u))
            {
                int v=al.get(0),wt=al.get(1);
                
                if(visited[v]==false && dist[u]!=(int)1e9 && dist[u]+wt<dist[v])
                {
                    dist[v]=dist[u]+wt;
                    pq.add(new int[]{dist[v],v});
                }
            }
        }
        
        return dist;
    }
    
    static int shortestPath(int n, int m, int a, int b, ArrayList<ArrayList<Integer>> edges) {
        
        ArrayList<ArrayList<ArrayList<Integer>>> graph=new ArrayList<>();
        ArrayList<int[]> curved=new ArrayList<>();
        
        for(int i=0;i<=n;i++)
        {
            graph.add(new ArrayList<>());
        }
       
       for(int i=0;i<edges.size();i++)
       {
           int u=edges.get(i).get(0);
           int v=edges.get(i).get(1);
           int w1=edges.get(i).get(2);
           int w2=edges.get(i).get(3);
           
           curved.add(new int[]{u,v,w2});
           
           ArrayList<Integer> t1=new ArrayList<>();
           t1.add(u); t1.add(w1);
           
           ArrayList<Integer> t2=new ArrayList<>();
           t2.add(v); t2.add(w1);
           
           graph.get(u).add(t2);
           graph.get(v).add(t1);
       }
        
        int[] distA=dijkstra(a,n,graph);
        int[] distB=dijkstra(b,n,graph);
        
        
        int ans=distA[b];
        
        for(int i=0;i<m;i++)
        {
            int u=curved.get(i)[0];
            int v=curved.get(i)[1];
            int wt=curved.get(i)[2];
            
                ans=Math.min(ans,distA[u]+wt+distB[v]);
                ans=Math.min(ans,distB[u]+wt+distA[v]);

        }
        
        if(ans>=1e9) return -1;
        
            return ans;
    }
};