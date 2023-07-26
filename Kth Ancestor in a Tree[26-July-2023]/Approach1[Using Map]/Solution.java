//  >> JAVA CODE <<

class Solution
{
    public int kthAncestor(Node root, int k, int node) {
    Map<Integer, Integer> parentMap = new HashMap<>();
    getParents(root, -1, parentMap);
    
    int nn=node;
    while (parentMap.containsKey(nn) && k > 0) {
        nn = parentMap.get(nn);
        k--;
    }
    return ! parentMap.containsKey(nn) ? -1 : nn;
}

    private void getParents(Node root, int par, Map<Integer, Integer> parentMap) {
        if (root == null) {
            return;
        }
        parentMap.put(root.data, par);
        getParents(root.left, root.data, parentMap);
        getParents(root.right, root.data, parentMap);
    }
    
}
