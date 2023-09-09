//  >>  JAVA CODE <<

class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public void solve(Node root,int[] ans,int[] k)
    {
        if(root==null) return;
        
        solve(root.right,ans,k);
        
        k[0]--;
        if(k[0]==0) ans[0]=root.data;
        
        solve(root.left,ans,k);
    }
    public int kthLargest(Node root,int K)
    {
        int[] ans={-1};
        
        solve(root,ans,new int[]{K});
        
        return ans[0];
    }
}