//  >> JAVA CODE <<

class Solution {
    private static int[] res;
    
    int minDiff(Node root, int K) {
        res = new int[]{Integer.MAX_VALUE};
        solve(root, K);
        return res[0];
    }
    
    static void solve(Node root, int k) {
        if (root == null) return;
        
        res[0] = Math.min(res[0], Math.abs(root.data - k));
        
        if (k < root.data) {
            solve(root.left, k);
        } else {
            solve(root.right, k);
        }
    }
}