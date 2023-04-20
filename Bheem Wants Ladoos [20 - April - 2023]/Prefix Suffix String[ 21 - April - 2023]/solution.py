#   >> PYTHON CODE <<

class Solution:
    class TrieNode:
        def __init__(self):
            self.isEndOfWord=False
            self.children=[None]*26
        
        def insert(self,s1,root):
            cur=root
            for i in range(0,len(s1)):
                index=ord(s1[i])-ord('a')
                if(cur.children[index] is None):
                    cur.children[index]=Solution.TrieNode()
                
                cur=cur.children[index]
            
            cur.isEndOfWord=True
        
        def search(self,s1,root):
            cur=root
            for i in range(0,len(s1)):
                index=ord(s1[i])-ord('a')
                if(cur.children[index] is None):
                    return False
                
                cur=cur.children[index]
            
            return True
            
    def prefixSuffixString(self, s1, s2) -> int:
        
        root=self.TrieNode()
        
        for val in s1:
            root.insert(val[::-1],root)
            root.insert(val,root)
        
        ans=0;
        
        for val in s2:
            if(root.search(val,root) or root.search(val[::-1],root)):
                ans+=1
        
        return ans