//  >> C++ CODE <<

int solve(Node* root, int k, int node, int* ans) {
    if (root == nullptr) {
        return -1;
    }
    if (root->data == node) {
        return 0;
    }
    
    int leftSearch = solve(root->left, k, node, ans);
    int rightSearch = solve(root->right, k, node, ans);
    
    if (leftSearch != -1 && rightSearch == -1) {
        if (leftSearch + 1 == k) {
            *ans = root->data;
        }
        return leftSearch + 1;
    } else if (rightSearch != -1 && leftSearch == -1) {
        if (rightSearch + 1 == k) {
            *ans = root->data;
        }
        return rightSearch + 1;
    }
    return -1;
}
int kthAncestor(Node* root, int k, int node) {
    int ans = -1;
    solve(root, k, node, &ans);
    return ans;
}