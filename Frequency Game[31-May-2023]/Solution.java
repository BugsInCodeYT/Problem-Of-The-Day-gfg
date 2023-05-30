//  >> JAVA CODE <<

public static int LargButMinFreq(int arr[], int n) {
        var map=new HashMap<Integer,Integer>();
        
        for(var el:arr)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }
        
        int ans=Integer.MIN_VALUE;
        int freq=Integer.MAX_VALUE;
        for(var key:map.keySet())
        {
            if(map.get(key)<freq)
            {
                ans=key;
                freq=map.get(key);
            }
            else if(map.get(key)==freq)
            {
                ans=Math.max(ans,key);
            }
        }
        
            return ans;
    }