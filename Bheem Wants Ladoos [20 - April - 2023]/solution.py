//    >> PYTHON CODE <<


class Solution:
    def ladoos(self, root, home, k):
        def findforSubtree(root,dis):
            if(root is None or dis<0):
                return 0
            if(dis == 0):
                return root.data
            
            return root.data + findforSubtree(root.left,dis-1) + findforSubtree(root.right,dis-1)
        
        
        def solve(root,home,k,ans):
            if(root == None):
                return -1
            if(root.data == home):
                ans[0]+=findforSubtree(root,k)
                return 0
            
            leftDistance=solve(root.left,home,k,ans)
            rightDistance=solve(root.right,home,k,ans)
            
    
            if rightDistance != -1:
                if(rightDistance+1<=k):
                    ans[0]+=root.data+findforSubtree(root.left,k-rightDistance-2)
                
                return rightDistance+1
                
            if leftDistance != -1:
                if(leftDistance+1<=k):
                    ans[0]+=root.data+findforSubtree(root.right,k-leftDistance-2)
                
                return leftDistance+1
            
            return -1
        
        ans=[0]    
        solve(root,home,k,ans)
        return ans[0]