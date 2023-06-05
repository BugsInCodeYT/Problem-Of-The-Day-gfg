#  >> PYTHON CODE <<

def minDiff(self,root, K):
    self.res=[1e9]

    #method
    def solve(root,k):
        if(root is None): return
    
        self.res[0]=min(self.res[0],abs(root.data-k))
        
        if(k<root.data):
            solve(root.left,k)
        else:
            solve(root.right,k)
    

    solve(root,K)
    
    return self.res[0]