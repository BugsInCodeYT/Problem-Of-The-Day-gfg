

class Solution {
    public static long solve(int root,ArrayList<ArrayList<Integer>> tree,int[] A,int k)
    {
        if(tree.get(root).size()==0) return (long)Math.pow(-1,k)*A[root-1];
        
        long max=Integer.MIN_VALUE;
        
        for(Integer in:tree.get(root))
        {
            max=Math.max(max,solve(in,tree,A,k+1));
        }
        
        return (long)Math.pow(-1,k)*A[root-1]+max;
    }
    public static long bestNode(int N, int[] A, int[] P) {
        
        ArrayList<ArrayList<Integer>> tree=new ArrayList<>();
        
        for(int i=0;i<=N;i++)
        {
            tree.add(new ArrayList<>());
        }
        
        for(int i=1;i<P.length;i++)
        {
            int u=P[i];
            int v=i+1;
            
            tree.get(u).add(v);
        }
        
        
        long ans=Integer.MIN_VALUE;
        
        for(int i=1;i<=N;i++)
        {
            long val=solve(i,tree,A,0);
            //System.out.println(val);
            ans=Math.max(ans,val);
        }
        
            return ans;
    }
}
        