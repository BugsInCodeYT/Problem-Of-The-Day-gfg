//  >> C++ CODE <<

class Solution {
    public:
    int res[1];
    
    int minDiff(Node* root, int K) {
        res[0] =1e9;
        solve(root, K);
        return res[0];
    }
    
    void solve(Node* root, int k) {
        if (root == nullptr) return;
        
        res[0] =min(res[0], abs(root->data - k));
        
        if (k < root->data) {
            solve(root->left, k);
        } else {
            solve(root->right, k);
        }
    }
};