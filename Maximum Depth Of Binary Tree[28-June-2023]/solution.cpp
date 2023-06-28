//  >> C++ CODE <<

int maxDepth(Node *root){
        if(root==NULL) return 0;
        
        return 1+max(maxDepth(root->left),maxDepth(root->right));
}