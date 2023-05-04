//  >> C++ CODE <<


class Solution {
public:
    int goodSubtrees(Node* root, int k) {
        
        int ans = 0;
        solve(root, k, ans);
        return ans;
    }
    
private:
    unordered_set<int> solve(Node* root, int k, int& ans) {
        if (root == nullptr) {
            return {};
        }
        
        unordered_set<int> left = solve(root->left, k, ans);
        unordered_set<int> right = solve(root->right, k, ans);
        
        left.insert(root->data);
        for (auto node : right) {
            left.insert(node);
        }
        
        if (left.size() <= k) {
            ans++;
        }
        
        return left;
    }
};