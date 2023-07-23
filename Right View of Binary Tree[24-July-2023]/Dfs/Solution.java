//  >> Java Code <<

class Solution{
    //Function to return list containing elements of right view of binary tree.
    void solve(Node node,ArrayList<Integer> ans,int level,int[] last)
    {
        if(node==null) return;
        
        if(last[0]<level)
        {
            ans.add(node.data);
            last[0]=level;
        }
        
        solve(node.right,ans,level+1,last);
        solve(node.left,ans,level+1,last);
    }
    ArrayList<Integer> rightView(Node node) {
       ArrayList<Integer> ans=new ArrayList<>();
       int[] last={0};
       solve(node,ans,1,last);
       
       return ans;
    }
}