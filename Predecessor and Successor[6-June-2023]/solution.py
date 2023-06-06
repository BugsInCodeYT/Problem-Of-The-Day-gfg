#  >> PYTHON CODE <<

class Solution:
    def findPreSuc(self, root, pre, suc, key):
        #method
        def solve(root,pre,suc,k):
            if(root is None):
                return
        
            if(root.key==k):
                solve(root.left,pre,suc,k)
                solve(root.right,pre,suc,k)
            elif(root.key<k):
                pre[0]=root
                solve(root.right,pre,suc,k)
            else:
                suc[0]=root
                solve(root.left,pre,suc,k)
        
        
        predecessor = [pre]
        successor = [suc]
        solve(root,predecessor,successor,key)
        
        return predecessor[0], successor[0]