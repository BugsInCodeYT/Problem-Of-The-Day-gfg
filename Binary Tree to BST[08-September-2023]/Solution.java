//   >> JAVA CODE <<

class Solution
{
    void inorder(Node root,ArrayList<Integer> list)
    {
        if(root==null) return;
        
        inorder(root.left,list);
        
        list.add(root.data);
        
        inorder(root.right,list);
    }
    void convert(Node root,ArrayList<Integer> list,int[] index)
    {
        if(root==null) return;
        
        convert(root.left,list,index);
        
        root.data=list.get(index[0]);
        index[0]++;
        
        convert(root.right,list,index);
    }
    Node binaryTreeToBST(Node root)
    {
       ArrayList<Integer> inorderList=new ArrayList<>();
       
       inorder(root,inorderList);
       
       Collections.sort(inorderList);
       
       convert(root,inorderList,new int[]{0});
       
       return root;
    }
}