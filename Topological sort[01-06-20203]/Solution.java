//  >> JAVA CODE <<

static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] indegree=new int[V];
        
        for(int i=0;i<V;i++)
        {
            for(var nn:adj.get(i))
            {
                indegree[nn]++;
            }
        }
        
        
        int[] ans=new int[V];
        int index=0;
        Queue<Integer> q=new LinkedList<>();
        
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        
        while(!q.isEmpty())
        {
            int nn=q.poll();
            
            ans[index++]=nn;
            
            for(var i:adj.get(nn))
            {
                indegree[i]-=1;
                if(indegree[i]==0)
                    q.add(i);
            }
        }
        
            return ans;
    }