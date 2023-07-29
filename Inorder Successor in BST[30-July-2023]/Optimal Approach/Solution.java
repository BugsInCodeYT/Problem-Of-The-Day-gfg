//  >> JAVA CODE <<

class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    
	public Node inorderSuccessor(Node root,Node x)
    {
       Node ans=null;
       
       while(root!=null)
       {
           if(root.data<=x.data)
           {
               root=root.right;
           }
           else
           {
               ans=root;
               root=root.left;
           }
       }
       
        return ans;
       
    }

}