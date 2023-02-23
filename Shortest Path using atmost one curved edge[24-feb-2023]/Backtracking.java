

//User function Template for Java

class Solution {
    static int solve(int src,ArrayList<ArrayList<ArrayList<Integer>>> graph,int target,boolean[] visited,boolean used)
    {
        if(src==target) return 0;
        
        int ans=Integer.MAX_VALUE/2;
        
        visited[src]=true;
        
        for(ArrayList<Integer> list:graph.get(src))
        {
            if(visited[list.get(0)]==false)
            {
                if(used==false)
                {
                    int val=Math.min(list.get(2)+solve(list.get(0),graph,target,visited,!used),list.get(1)+solve(list.get(0),graph,target,visited,used));
                    ans=Math.min(ans,val);
                }
                else
                {
                    ans=Math.min(ans,list.get(1)+solve(list.get(0),graph,target,visited,used));
                }
            }
        }
        
        visited[src]=false;
        
            return ans;
    }
    static int shortestPath(int n, int m, int a, int b, ArrayList<ArrayList<Integer>> edges) {
       
       ArrayList<ArrayList<ArrayList<Integer>>> graph=new ArrayList<>();
       
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
           
           ArrayList<Integer> t1=new ArrayList<>();
           t1.add(u); t1.add(w1); t1.add(w2);
           
           ArrayList<Integer> t2=new ArrayList<>();
           t2.add(v); t2.add(w1); t2.add(w2);
           
           graph.get(u).add(t2);
           graph.get(v).add(t1);
       }
       
       boolean[] visited=new boolean[n+1];
       
        return solve(a,graph,b,visited,false);
    }
};