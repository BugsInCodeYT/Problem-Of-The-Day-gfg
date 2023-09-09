//  >> CPP CODE <<

class Solution {
public:
    void solve(Node* root, int& ans, int& k) {
        if (root == nullptr) return;

        solve(root->right, ans, k);

        k--;
        if (k == 0) ans = root->data;

        solve(root->left, ans, k);
    }

    int kthLargest(Node* root, int K) {
        int ans = -1;
        solve(root, ans, K);
        return ans;
    }
};