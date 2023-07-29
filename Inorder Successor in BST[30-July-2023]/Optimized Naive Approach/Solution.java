//  >> JAVA CODE: APPROACH 1 <<

class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public void inorder(Node root,Node x,boolean[] found,Node[] ans)
    {
        if(root==null) return;
        
        inorder(root.left,x,found,ans);
        
        if(found[0]==true)
        {
            ans[0]=root;
            found[0]=false;
        }
        if(root.data==x.data)
        {
            found[0]=true;
        }
        
        
        inorder(root.right,x,found,ans);
    }
	public Node inorderSuccessor(Node root,Node x)
    {
       boolean[] found={false};
       Node[] ans={null};
       
       inorder(root,x,found,ans);
       
       
       return ans[0];
    }
}