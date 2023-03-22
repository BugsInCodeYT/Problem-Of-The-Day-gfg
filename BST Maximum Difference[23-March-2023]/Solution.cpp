//				>> C++ CODE <<


class Solution {
public:
    int find(Node* root, int target, Node** targetNode) {
        if (root == NULL) return INT_MIN;
        if (root->data == target) {
            *targetNode = root;
            return target;
        }
        
        if (target > root->data) {
            return root->data + find(root->right, target, targetNode);
        } else {
            return root->data + find(root->left, target, targetNode);
        }
    }
    
    int solve(Node* root) {
        if (root == NULL) return INT_MAX / 2;
        if (root->left == NULL && root->right == NULL) return root->data;
        
        int left = root->data + solve(root->left);
        int right = root->data + solve(root->right);
        
        return min(left, right);
    }
    
    int maxDifferenceBST(Node* root, int target) {
        Node* targetNode = NULL;
        int rootToTarget = find(root, target, &targetNode);
        
        if (targetNode == NULL) return -1;
        
        int targetToLeaf = solve(targetNode);
        
        return rootToTarget - targetToLeaf;
    }
};
