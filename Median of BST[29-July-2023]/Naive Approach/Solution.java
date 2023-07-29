class Tree
{
    public static void inorder(Node root,ArrayList<Integer> list)
    {
        if(root==null) return;
        
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static float findMedian(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        
        inorder(root,list);
        int n=list.size();
        
        if(n%2==0)
        {
            int sum=list.get(n/2-1)+list.get(n/2);
            
            return sum%2==0?sum/2:(float)((double)sum/2);
        }
        else
        {
            return list.get((n+1)/2-1);
        }
    }
}