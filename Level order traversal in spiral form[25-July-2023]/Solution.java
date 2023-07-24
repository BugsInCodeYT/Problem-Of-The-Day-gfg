//  >> JAVA CODE <<

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    void reverse(ArrayList<Integer> list,int st,int end)
    {
        while(st<end){
            int temp=list.get(st);
            list.set(st,list.get(end));
            list.set(end,temp);
            st++;
            end--;
        }
    }
    ArrayList<Integer> findSpiral(Node root) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        
        Queue<Node> q=new LinkedList<>();
        int level=0;
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size=q.size();
            
            int st=ans.size();
            int end=ans.size()+size-1;
            
            for(int i=0;i<size;i++)
            {
                Node nn=q.poll();
                
                ans.add(nn.data);
                
                if(nn.left!=null) q.add(nn.left);
                if(nn.right!=null) q.add(nn.right);
            }
            
            if(level%2==0)
            {
                reverse(ans,st,end);
            }
            
            level++;
        }
        
            return ans;

    }
}