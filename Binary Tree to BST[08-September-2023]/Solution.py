#  >> PYTHON CODE <<

class Solution:
    # The given root is the root of the Binary Tree
    # Return the root of the generated BST
    def binaryTreeToBST(self, root):
        def inorder(root,inorderList):
            if(root is None): return
        
            inorder(root.left,inorderList)
        
            inorderList.append(root.data)
            
            inorder(root.right,inorderList)
        
        def convert(root,inorderList,index):
            if(root is None): return
        
            convert(root.left,inorderList,index)
            
            root.data=inorderList[index[0]]
            index[0]+=1
            convert(root.right,inorderList,index)
        
        inorderList=[]
        
        inorder(root,inorderList)
        
        inorderList.sort()
        
        convert(root,inorderList,[0])
        
        return root