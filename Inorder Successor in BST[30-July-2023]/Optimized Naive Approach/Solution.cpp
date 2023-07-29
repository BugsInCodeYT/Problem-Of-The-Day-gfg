// >> CPP CODE: APPROACH 1 <<

class Solution{
  public:
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    void inorder(Node *root,Node *x,Node** ans,bool* found)
    {
        if(root==NULL) return;
        
        inorder(root->left,x,ans,found);
        
        if(*found==true)
        {
            *ans=root;
            *found=false;
        }
        else if(root->data==x->data)
        {
            *found=true;
        }
        
        
        inorder(root->right,x,ans,found);
    }
    Node * inOrderSuccessor(Node *root, Node *x)
    {
        Node *ans=NULL;
        bool found=false;
        
        inorder(root,x,&ans,&found);
        
        return ans;
    }
};