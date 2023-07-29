void inorder(Node* root, vector<int>& list) {
    if(root==nullptr) return;
    inorder(root->left,list);
    list.push_back(root->data);
    inorder(root->right,list);
}
float findMedian(Node* root) {
    vector<int> list;
    inorder(root,list);
    int n=list.size();
    if(n%2==0) {
        int sum=list[n/2-1]+list[n/2];
        return sum%2==0?sum/2:(float)((double)sum/2);
    } else {
        return list[(n+1)/2-1];
    }
}