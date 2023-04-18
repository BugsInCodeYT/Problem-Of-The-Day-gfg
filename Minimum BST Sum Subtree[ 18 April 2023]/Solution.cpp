//    >> C++ CODE <<


class Data{
public:
    int nodeMin;
    int nodeMax;
    int nodeSum;
    int countNode;
    bool isBST;
};

class Solution {
public:
    int mn;
    Data *minSubtree(Node *root, int target) {
        if (root == NULL) {
            Data *p = new Data();
            p->nodeMin = INT_MAX;
            p->nodeMax = INT_MIN;
            p->nodeSum = 0;
            p->countNode = 0;
            p->isBST = true;
            return p;
        }
        Data *left = minSubtree(root->left, target);
        Data *right = minSubtree(root->right, target);
        int nodeSum = left->nodeSum + right->nodeSum + root->data;
        int countNode = left->countNode + right->countNode + 1;
        int nodeMin1 = min(root->data, min(left->nodeMin, right->nodeMin));
        int nodeMax1 = max(root->data, max(left->nodeMax, right->nodeMax));
        bool isBST = root->data > left->nodeMax && root->data < right->nodeMin &&
                        left->isBST && right->isBST;
        if (isBST && nodeSum == target) {
            mn = min(mn, countNode);
        }
        Data *p = new Data();
        p->nodeMin = nodeMin1;
        p->nodeMax = nodeMax1;
        p->nodeSum = nodeSum;
        p->countNode = countNode;
        p->isBST = isBST;
        return p;
    }
    int minSubtreeSumBST(int target, Node *root) {
        mn = INT_MAX;
        minSubtree(root, target);
        if (mn == INT_MAX) mn = -1;
        return mn;
    }
};
