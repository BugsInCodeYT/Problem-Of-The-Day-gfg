class Solution {
    public int maxLevelSum(Node root) {
        
        Queue<Node> q=new LinkedList<>();
        
        q.add(root);
        
        int maxSum=Integer.MIN_VALUE;
        

        while(!q.isEmpty())
        {
            int size=q.size();
            
		//current level sum
            int levelSum=0;
            
            for(int i=0;i<size;i++)
            {
                Node nn=q.poll();
                
                levelSum=levelSum+nn.data;
                
                if(nn.left!=null)
                {
                    q.add(nn.left);
                }
                if(nn.right!=null)
                {
                    q.add(nn.right);
                }
            }
            
		//Maximum Level Sum..
            maxSum=Math.max(maxSum,levelSum);
        }
        
            return maxSum;
    }
}