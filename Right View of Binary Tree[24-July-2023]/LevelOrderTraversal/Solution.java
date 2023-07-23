//  >> JAVA CODE <<

class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                Node nn=q.poll();
                
                if(i==size-1) ans.add(nn.data);
                
                if(nn.left!=null) q.add(nn.left);
                if(nn.right!=null) q.add(nn.right);
            }
        }
        
            return ans;
    }
}