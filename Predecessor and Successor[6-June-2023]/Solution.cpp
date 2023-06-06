//  >> C++ CODE <<

class Solution
{
    public:
    void findPreSuc(Node* root, Node*& pre, Node*& suc, int key)
    {
        Node* predecessor[]={pre};
        Node* successor[]={suc};
         solve(root, predecessor, successor, key);
        
        pre=predecessor[0];
        suc=successor[0];
         
    }
    void solve(Node* root, Node* pre[], Node* suc[], int k) {
        if (root == nullptr) {
            return;
        }
        
        if (root->key == k) {
            solve(root->left, pre, suc, k);
            solve(root->right, pre, suc, k);
        }
        else if (root->key < k) {
            pre[0] = root;
            solve(root->right, pre, suc, k);
        }
        else {
            suc[0] = root;
            solve(root->left, pre, suc, k);
        }
    }