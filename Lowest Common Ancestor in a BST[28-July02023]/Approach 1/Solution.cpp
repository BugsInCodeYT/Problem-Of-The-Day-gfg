//  >> C++ CODE <<

class Solution{
    public:
        Node* LCA(Node *root, int n1, int n2)
        {
            if(root==NULL) return NULL;
            if(root->data==n1 or root->data==n2) return root;
            
            Node* left=LCA(root->left,n1,n2);
            Node* right=LCA(root->right,n1,n2);
            
            if(left!=NULL and right!=NULL) return root;
            
            return left!=NULL?left:right;
        }

};