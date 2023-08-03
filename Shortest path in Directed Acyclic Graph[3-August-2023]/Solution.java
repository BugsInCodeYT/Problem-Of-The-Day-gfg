//  >> JAVA CODE <<

public int[] shortestPath(int N,int M, int[][] edges) {
	    
	    ArrayList<ArrayList<ArrayList<Integer>>> adj=new ArrayList<>();
	    
	    for(int i=0;i<N;i++) adj.add(new ArrayList<>());
	    
	    for(int i=0;i<M;i++)
	    {
	        int u=edges[i][0];
	        int v=edges[i][1];
	        int w=edges[i][2];
	        
	        ArrayList<Integer> t1=new ArrayList<>();
	    
	        t1.add(v); t1.add(w);
	        
	        adj.get(u).add(t1);
	    }
	    
	    
		PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
		int[] dist=new int[N];
		
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[0]=0;
		
		pq.add(new int[]{0,0});
		
		while(!pq.isEmpty())
		{
		    int[] values=pq.poll();
		    int node=values[0];
		    int distance=values[1];
		    
		    for(ArrayList<Integer> in :adj.get(node))
		    {
		        int neighbor=in.get(0);
		        int ndistance=in.get(1);
		        if(distance+ndistance<dist[neighbor])
		        {
		            dist[neighbor]=distance+ndistance;
		            pq.add(new int[]{neighbor,dist[neighbor]});
		        }
		    }
		}
		
		for(int i=0;i<N;i++)
		    if(dist[i]==Integer.MAX_VALUE)
		          dist[i]=-1;
		
		return dist;
	}