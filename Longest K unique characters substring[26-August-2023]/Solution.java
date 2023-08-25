//  >> JAVA CODE <<

class Solution {
    public int longestkSubstr(String s, int k) {
        int st=0,end=0;
        int n=s.length();
        
        HashMap<Character,Integer> mp=new HashMap<>();
        int ans=-1;
        while(end<n)
        {
            mp.put(s.charAt(end),mp.getOrDefault(s.charAt(end),0)+1);
            
            int distChars=mp.size();
            
            if(distChars==k)
                ans=Math.max(ans,end-st+1);
            else if(distChars>k)
            {
                mp.put(s.charAt(st),mp.get(s.charAt(st))-1);
                if(mp.get(s.charAt(st))==0)
                    mp.remove(s.charAt(st));
                
                st+=1;
            }
            
            end+=1;
        }   
        
            return ans;
    }
}