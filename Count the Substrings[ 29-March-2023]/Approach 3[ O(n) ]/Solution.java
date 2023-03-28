//		>> JAVA CODE <<

int countSubstring(String S) 
    { 
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ans=0;
        int sum=0;
        for(char ch:S.toCharArray())
        {
            int val;
            if(Character.isUpperCase(ch))
            {
                val=1;
            }
            else
            {
                val=-1;
            }
            
            sum+=val;
            
            if(map.containsKey(sum))
            {
                ans+=map.get(sum);
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
            return ans;
    }