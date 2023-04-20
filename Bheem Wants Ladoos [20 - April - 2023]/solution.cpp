//    >> C++ CODE <<

class Solution{
    public:
        int ans;
    
        int findForSubtree(Node* root, int dis) {
            if (root == nullptr || dis < 0) {
                return 0;
            }
            if (dis == 0) {
                return root->data;
            }
    
            return root->data + findForSubtree(root->left, dis - 1) + findForSubtree(root->right, dis - 1);
        }
    
        int solve(Node* root, int home, int k) {
            if (root == nullptr) {
                return -1;
            }
            if (root->data == home) {
                ans += findForSubtree(root, k);
                return 0;
            }
    
            int leftDistance = solve(root->left, home, k);
            int rightDistance = solve(root->right, home, k);
    
            if (leftDistance != -1) {
                if (leftDistance + 1 <= k) {
                    ans += root->data + findForSubtree(root->right, k - leftDistance - 2);
                }
                return leftDistance + 1;
            }
    
            if (rightDistance != -1) {
                if (rightDistance + 1 <= k) {
                    ans += root->data + findForSubtree(root->left, k - rightDistance - 2);
                }
                return rightDistance + 1;
            }
    
            return -1;
        }
    
        int ladoos(Node* root, int home, int k) {
            
            ans = 0;
            solve(root, home, k);
            return ans;
            
        }
};