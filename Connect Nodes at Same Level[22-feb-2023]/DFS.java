class Solution {
    public Node getNextRight(Node root)
    {
        Node next=root.nextRight;
        
        while(next!=null)
        {
            if(next.left!=null) return next.left;
            if(next.right!=null) return next.right;
            
            next=next.nextRight;
        }
        
            return null;
    }
    public void connect(Node root) {
        
        if(root==null) return;
        if(root.left==null && root.right==null) connect(root.nextRight);
        
        if(root.nextRight!=null) connect(root.nextRight);
        
        if(root.left!=null)
        {
            if(root.right!=null)
            {
                root.left.nextRight=root.right;
                root.right.nextRight=getNextRight(root);
            }
            else
                root.left.nextRight=getNextRight(root);
            
            connect(root.left);
        }
        else if(root.right!=null)
        {
            root.right.nextRight=getNextRight(root);
            
            connect(root.right);
        }
    }
}