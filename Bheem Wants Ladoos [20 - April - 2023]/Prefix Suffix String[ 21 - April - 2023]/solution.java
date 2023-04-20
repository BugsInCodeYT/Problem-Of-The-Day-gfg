//   >> JAVA CODE <<

class Solution
{
    class TrieNode{
        boolean isEndOfWord;
        TrieNode[] children;
        
        TrieNode()
        {
            this.isEndOfWord=true;
            this.children=new TrieNode[26];
        }
    }   
    
    public void insert(String s,TrieNode root)
    {
        TrieNode cur=root;
        
        for(int i=0;i<s.length();i++)
        {
            int index=s.charAt(i)-'a';
            
            if(cur.children[index]==null)
                cur.children[index]=new TrieNode();
                
            cur=cur.children[index];
        }
        
        cur.isEndOfWord=true;
    }
    public boolean search(String s,TrieNode root)
    {
        TrieNode cur=root;
        
        for(int i=0;i<s.length();i++)
        {
            int index=s.charAt(i)-'a';
            
            if(cur.children[index]==null)
                return false;
                
            cur=cur.children[index];
        }
        
        
        return true;
    }
    public int prefixSuffixString(String s1[],String s2[])
    {
        
        TrieNode root=new TrieNode();
        
        for(var val:s1)
        {
            StringBuffer rev=new StringBuffer(val); 
            rev.reverse();
            
            insert(val,root);
            insert(rev.toString(),root);
        }
        
        int ans=0;
        
        for(var val:s2)
        {
            StringBuffer rev=new StringBuffer(val); 
            rev.reverse();
            
            if(search(val,root) || search(rev.toString(),root))
                ans++;
        }
            
            return ans;
    }
}