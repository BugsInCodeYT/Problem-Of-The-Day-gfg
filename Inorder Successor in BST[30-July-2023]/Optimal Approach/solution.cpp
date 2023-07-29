//  >> CPP CODE <<

class Solution{
  public:
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    Node * inOrderSuccessor(Node *root, Node *x)
    {
        Node *ans=NULL;
        
        while(root!=NULL)
        {
            if(root->data<=x->data)
            {
                root=root->right;
            }
            else
            {
                ans=root;
                root=root->left;
            }
        }
        
            return ans;
    }
};