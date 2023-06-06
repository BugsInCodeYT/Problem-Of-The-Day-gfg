//  >> JAVA CODE <<


//static Node succ,pre;

static void solve(Node root,Node[] predecessor,Node[] successor,int key)
{
    if(root==null) return;
    if(root.data==key)
    {
        solve(root.right,predecessor,successor,key);
        solve(root.left,predecessor,successor,key);
    }
    else if(root.data<key)
    {
        predecessor[0]=root;
        solve(root.right,predecessor,successor,key);
    }
    else
    {
        successor[0]=root;
        solve(root.left,predecessor,successor,key);
    }
    
}
public static void findPreSuc(Node root,int key)
{
   Node[] predecessor={pre};
   Node[] successor={suc};
   
   solve(root,predecessor,successor,key);
   
   pre=predecessor[0]; suc=successor[0];
   
}