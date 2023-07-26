//  >> JAVA CODE <<

class Solution
{
    public int kthAncestor(Node root, int k, int node) {
    Map<Node, Node> parentMap = new HashMap<>();
    getParents(root, null, parentMap);
    Node nn = find(root, node);
    while (nn != null && k > 0) {
        nn = parentMap.get(nn);
        k--;
    }
    return nn == null ? -1 : nn.data;
}

    private void getParents(Node root, Node par, Map<Node, Node> parentMap) {
        if (root == null) {
            return;
        }
        parentMap.put(root, par);
        getParents(root.left, root, parentMap);
        getParents(root.right, root, parentMap);
    }
    
    private Node find(Node root, int node) {
        if (root == null) {
            return null;
        }
        if (root.data == node) {
            return root;
        }
        Node leftSearch = find(root.left, node);
        Node rightSearch = find(root.right, node);
        return rightSearch == null ? leftSearch : rightSearch;
    }

}