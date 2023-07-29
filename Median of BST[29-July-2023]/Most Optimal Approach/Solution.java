class Tree
{
    public static int countNodes(Node root)
    {
        Node cur=root;
        int count=0;
        while(cur!=null)
        {
            if(cur.left!=null)
            {
                Node temp=cur.left;
                
                while(temp.right!=null && temp.right!=cur)
                {
                    temp=temp.right;
                }
                
                if(temp.right==null)
                {
                    temp.right=cur;
                    cur=cur.left;
                }
                else
                {
                    temp.right=null;
                    count++;
                    cur=cur.right;
                }
            }
            else
            {
                count++;
                cur=cur.right;
            }
        }
        
            return count;
    }
    public static float findMedian(Node root)
    {
        int nodes=countNodes(root);
        
        int req=nodes/2;
        int prev=-1;
        int current=-1;
        
        Node cur=root;
        while(cur!=null)
        {
            if(cur.left!=null)
            {
                Node temp=cur.left;
                
                while(temp.right!=null && temp.right!=cur)
                {
                    temp=temp.right;
                }
                
                if(temp.right==null)
                {
                    temp.right=cur;
                    cur=cur.left;
                }
                else
                {
                    temp.right=null;
                    
                    prev=current;
                    current=cur.data;
                    
                    req--;
                    if(req<0) break;
                    cur=cur.right;
                }
            }
            else
            {
                prev=current;
                current=cur.data;
                
                req--;
                if(req<0) break;
                cur=cur.right;
            }
        }
       // System.out.println(nodes+"::"+current+" "+prev);
            return nodes%2==0?(float)(prev+current)/2:current;
    }
}