#   >> PYTHON CODE <<


def duplicateSubtreeNaryTree(self, root):
        self.map={}
        
        def solve(root):
            if(root is None):
                return ""
            
            returnValue=root.__str__()
            
            for ch in root.children:
                returnValue=returnValue+"#"+solve(ch)
            
            
            self.map[returnValue]=self.map.get(returnValue,0)+1
            
            return returnValue
        
        
        solve(root)
        
        ans=0
        for val in self.map.values():
            if(val>1):
                ans+=1
        
        return ans