class Solution {
    public void connect(Node root) {
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size=q.size();
            
            Node prev=null;
            for(int i=0;i<size;i++)
            {
                Node cur=q.poll();
                
                if(prev!=null)
                    prev.nextRight=cur;
                
                prev=cur;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
        }
    
    }
}