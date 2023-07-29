def findMedian(root):
    def inorder(root,elements):
        if(root==None): return root
        
        inorder(root.left,elements)
        elements.append(root.data)
        inorder(root.right,elements)
        
    elements=[]
    
    inorder(root,elements)
    
    n=len(elements)
    
    if(n%2==0): return (elements[n//2]+elements[n//2-1])/2 if (elements[n//2]+elements[n//2-1])%2==1 else int((elements[n//2]+elements[n//2-1])/2)

    return elements[(n+1)//2-1]