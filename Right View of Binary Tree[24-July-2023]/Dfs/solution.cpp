//  >> C++ CODE <<

class Solution
{
    public:
    vector<int> rightView(Node* root) {
        vector<int> ans;
        int last=0;
        solve(root, ans, 1, &last);
        return ans;
    }

    private:
    void solve(Node* root, vector<int>& ans, int level, int* last) {
        if (!root) return;

        if (*last < level) {
            ans.push_back(root->data);
            *last = level;
        }

        solve(root->right, ans, level + 1, last);
        solve(root->left, ans, level + 1, last);
    }
};
