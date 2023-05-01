// >> JAVA CODE <<

class Solution {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    String solve(Node root) {
        if(root == null) {
            return "";
        }
        
        String returnValue = Integer.toString(root.data);
        
        for(Node child : root.children) {
            returnValue += "#" + solve(child);
        }
        
        map.put(returnValue, map.getOrDefault(returnValue, 0) + 1);
        
        return returnValue;
    }
    
    int duplicateSubtreeNaryTree(Node root) {
        solve(root);
        
        int ans = 0;
        for(int val : map.values()) {
            if(val > 1) {
                ans++;
            }
        }
        
        return ans;
    }
}