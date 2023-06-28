#  >> PYTHON CODE <<

class Solution:
    def maxDepth(self,root):
        if root is None: return 0
        
        return 1+max(self.maxDepth(root.left),self.maxDepth(root.right))