#  >> PYTHON CODE <<

def kthAncestor(root,k, node):
    def solve(root,k,node,ans):
        if(root==None): return -1
        if(root.data==node): return 0
        
        left_search=solve(root.left,k,node,ans)
        right_search=solve(root.right,k,node,ans)
        
        if(left_search!=-1 and right_search==-1):
            if(left_search+1==k):
                ans[0]=root.data
            
            return left_search+1
        elif(right_search!=-1 and left_search==-1):
            if(right_search+1==k):
                ans[0]=root.data
            
            return right_search+1
        
        return -1
        
    
    ans=[-1]
    solve(root,k,node,ans)

    return ans[0]