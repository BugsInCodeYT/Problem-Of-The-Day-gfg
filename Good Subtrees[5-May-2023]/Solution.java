//  >> JAVA CODE <<

class Solution
{
    public static HashSet<Integer> solve(Node root,int k,int[] ans)
    {
        if(root==null)
        {
            return new HashSet<>();
        }
        
        HashSet<Integer> left=solve(root.left,k,ans);
        HashSet<Integer> right=solve(root.right,k,ans);
        
        left.addAll(right);
        
        left.add(root.data);
        
        if(left.size()<=k)
            ans[0]++;
        
        return left;
    }
    public static int goodSubtrees(Node root,int k)
    {
        int[] ans={0};
        solve(root,k,ans);
        
            return ans[0];
    }
}