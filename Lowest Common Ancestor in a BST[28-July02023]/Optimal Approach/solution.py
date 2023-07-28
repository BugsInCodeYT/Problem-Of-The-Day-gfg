#  >> PYTHON CODE <<

def LCA(root, n1, n2):
        
        if(root.data>max(n1,n2)):
            return LCA(root.left,n1,n2)
        elif(root.data<min(n1,n2)):
            return LCA(root.right,n1,n2)
        
        return root