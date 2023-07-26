#  >> PYTHON CODE <<

def kthAncestor(root,k, node):
    def getParents(root,par,parent_map):
        if(not root): return
    
        parent_map[root.data]=par
        
        getParents(root.left,root.data,parent_map)
        getParents(root.right,root.data,parent_map)
    
    mp={}
    
    getParents(root,-1,mp)

    while(node in mp and k>0):
        node=mp[node]
        k-=1
    
    return node if node in mp else -1
