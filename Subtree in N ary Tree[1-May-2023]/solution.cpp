//  >> CPP CODE <<


class Solution {
public:
    unordered_map<string, int> map;
    
    string solve(Node* root) {
        if(root == nullptr) {
            return "";
        }
        
        string returnValue = to_string(root->data);
        
        for(auto child : root->children) {
            returnValue += "#" + solve(child);
        }
        
        map[returnValue]++;
        
        return returnValue;
    }
    
    int duplicateSubtreeNaryTree(Node* root) {
        solve(root);
        
        int ans = 0;
        for(auto& val : map) {
            if(val.second > 1) {
                ans++;
            }
        }
        
        return ans;
    }
};