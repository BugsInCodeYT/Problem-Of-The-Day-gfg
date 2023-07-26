//  >> C++ CODE <<


void getParents(Node* root, int par, unordered_map<int, int>& parentMap) {
    if (root == nullptr) {
        return;
    }
    parentMap[root->data] = par;
    getParents(root->left, root->data, parentMap);
    getParents(root->right, root->data, parentMap);
}

int kthAncestor(Node* root, int k, int node) {
    unordered_map<int, int> parentMap;
    getParents(root, -1, parentMap);
    
    int nn = node;
    
    while (parentMap.find(nn)!=parentMap.end() && k > 0) {
        nn = parentMap[nn];
        k--;
    }
    
    return parentMap.find(nn)==parentMap.end() ? -1 : nn;
}
