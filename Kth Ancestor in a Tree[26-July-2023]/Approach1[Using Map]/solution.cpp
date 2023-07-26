//  >> C++ CODE <<


void getParents(Node* root, Node* par, unordered_map<Node*, Node*>& parentMap) {
    if (root == nullptr) {
        return;
    }
    parentMap[root] = par;
    getParents(root->left, root, parentMap);
    getParents(root->right, root, parentMap);
}

Node* find(Node* root, int node) {
    if (root == nullptr) {
        return nullptr;
    }
    
    if (root->data == node) {
        return root;
    }
    
    Node* leftSearch = find(root->left, node);
    Node* rightSearch = find(root->right, node);
    return rightSearch == nullptr ? leftSearch : rightSearch;
}


int kthAncestor(Node* root, int k, int node) {
    unordered_map<Node*, Node*> parentMap;
    getParents(root, nullptr, parentMap);
    
    Node* nn = find(root, node);
    
    while (nn != nullptr && k > 0) {
        nn = parentMap[nn];
        k--;
    }
    
    return nn == nullptr ? -1 : nn->data;
}