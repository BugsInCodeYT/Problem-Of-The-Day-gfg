#  >> PYTHON CODE <<

def LCA(root, n1, n2):
    def solve(root,n1,n2):
        if(not root): return None
        elif root.data==n1 or root.data==n2: return root
        
        left=solve(root.left,n1,n2)
        right=solve(root.right,n1,n2)
    
        if left and right:
            return root
        
    
        return left if left is not None else right
    
    return solve(root,n1,n2)