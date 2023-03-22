//				>> C++ CODE <<


class Solution {
public:
    static int find(Node *root, int target, Node* &targetNode) {
        if (root == NULL) return INT_MIN;
        if (root->data == target) {
            targetNode = root;
            return target;
        }
        int left = find(root->left, target, targetNode);
        int right = find(root->right, target, targetNode);

        if (left == INT_MIN) {
            if (right == INT_MIN) return INT_MIN;
            else return root->data + right;
        }
        else {
            return root->data + left;
        }
    }

    static int solve(Node *root) {
        if (root == NULL) return INT_MAX / 2;
        if (root->left == NULL && root->right == NULL) return root->data;

        int left = root->data + solve(root->left);
        int right = root->data + solve(root->right);

        return min(left, right);
    }

    static int maxDifferenceBST(Node *root, int target) {
        Node* targetNode = NULL;
        int rootToTarget = find(root, target, targetNode);

        if (targetNode == NULL) return -1;

        int targetToLeaf = solve(targetNode);

        return rootToTarget - targetToLeaf;
    }
};