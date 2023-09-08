//  >> CPP CODE <<

class Solution{
  public:
    void inorder(Node* root, vector<int>& list) {
        if (root == nullptr) return;
        
        inorder(root->left, list);
        
        list.push_back(root->data);
        
        inorder(root->right, list);
    }

    void convert(Node* root, vector<int>& list, int& index) {
        if (root == nullptr) return;
        
        convert(root->left, list, index);
        
        root->data = list[index];
        index++;
        
        convert(root->right, list, index);
    }

    Node* binaryTreeToBST(Node* root) {
        vector<int> inorderList;
       
        inorder(root, inorderList);
       
        sort(inorderList.begin(), inorderList.end());
       
        int index = 0;
        convert(root, inorderList, index);
       
        return root;
    }
};