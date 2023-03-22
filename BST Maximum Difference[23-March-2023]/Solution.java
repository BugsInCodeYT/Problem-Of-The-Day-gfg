//			>> JAVA CODE <<

class Solution
{
    public static int find(Node root,int target,Node[] targetNode)
    {
        if(root==null) return Integer.MIN_VALUE;
        if(root.data==target){
          targetNode[0]=root;  
          return target;
        }
        int left=find(root.left,target,targetNode);
        int right=find(root.right,target,targetNode);
        
        if(left==Integer.MIN_VALUE) 
        {
            if(right==Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else return root.data+right;
        }
        else
        {
            return root.data+left;  
        }
    }
    public static int solve(Node root)
    {
        if(root==null) return Integer.MAX_VALUE/2;
        if(root.left==null && root.right==null) return root.data;
        
        int left=root.data+solve(root.left);
        int right=root.data+solve(root.right);
        
            return Math.min(left,right);
    }
    public static int maxDifferenceBST(Node root,int target)
    {
        Node[] targetNode={null};
        int rootToTarget=find(root,target,targetNode);
        
        if(targetNode[0]==null) return -1;
        
        
        int targetToLeaf=solve(targetNode[0]);
        
            return rootToTarget-targetToLeaf;
    }
}