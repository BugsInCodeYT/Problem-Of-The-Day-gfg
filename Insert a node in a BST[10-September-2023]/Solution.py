#   >> PYTHON CODE <<

class Solution:
    #Function to insert a node in a BST. 
    def insert(self,root, Key):
        if(root is None): return Node(Key)
        
        if(Key>root.data): root.right=self.insert(root.right,Key)
        elif Key<root.data: root.left=self.insert(root.left,Key)

        return root