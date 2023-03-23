//  >> BRUTE FORCE RECURSIVE JAVA <<

class Solution 
{ 
    String removeReverse(String S) 
    { 
        
        while(true){
            HashMap<Character,Integer> map=new HashMap<>();
            int index=Integer.MAX_VALUE;
            for(int i=0;i<S.length();i++)
            {
                if(map.containsKey(S.charAt(i)))
                {
                    if(index>map.get(S.charAt(i)))
                        index=map.get(S.charAt(i));
                }
                else
                {
                    map.put(S.charAt(i),i);
                }
            }
            
            if(index==Integer.MAX_VALUE)
            {
                return S;
            }
            
            StringBuffer sb=new StringBuffer("");
            
            for(int i=S.length()-1;i>=0;i--)
            {
                if(i==index) continue;
                
                sb.append(S.charAt(i));
            }
            
             S=sb.toString();
        }
        
    }
} 