#  >> PYTHON CODE <<

def kthAncestor(root,k, node):
    def getParents(root,par,parent_map):
        if(not root): return
    
        parent_map[root]=par
        
        getParents(root.left,root,parent_map)
        getParents(root.right,root,parent_map)
    
    def find(root,node):
        if(not root): return None
        if(root.data==node): return root
        
        left_search=find(root.left,node)
        right_search=find(root.right,node)
        
        return right_search if not left_search else left_search
            
    
    mp={}
    
    getParents(root,-1,mp)
    nn=find(root,node)
    
    while(nn in mp and k>0):
        nn=mp[nn]
        k-=1
    
    return nn.data if nn in mp else -1