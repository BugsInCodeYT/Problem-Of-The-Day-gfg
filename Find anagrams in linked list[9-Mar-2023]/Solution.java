class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        
        ArrayList<Node> ans=new ArrayList<>();
        
        int[] map=new int[26];
        int[] listMap=new int[26];
        
        for(char ch:s.toCharArray())
        {
            map[ch-'a']++;   
        }
        
        //find the length of map
        int length=0;
        for(int i=0;i<26;i++) if(map[i]>0) length++;
        
        //two pointer start and end.
        Node st=head,end=head;
        
        //to keep track of count of character which have equal frequency in given string and list traversed till a particular index.
        int cnt=0;
        while(end!=null)
        {
            listMap[end.data-'a']++;
            
            if(map[end.data-'a']==listMap[end.data-'a']) cnt++;
            
            
            while(map[end.data-'a']<listMap[end.data-'a'])
            {
                if(map[st.data-'a']==listMap[st.data-'a']) cnt--;
                
                listMap[st.data-'a']--;
                st=st.next;
            }
            
            if(cnt==length)
            {
                ans.add(st);
                Node next=end.next;
                end.next=null;
                st=next;
                end=next;
                cnt=0;
                Arrays.fill(listMap,0);
            }
            else
                end=end.next;
        }
        
            return ans;
    }
}