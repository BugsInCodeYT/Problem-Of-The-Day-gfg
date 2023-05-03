 public static boolean palindrome(String str)
    {
        int low=0,high=str.length()-1;
        
        while(low<high)
        {
            if(str.charAt(low++)!=str.charAt(high--))
            return false;
        }
        
        return true;
    }
    public static boolean makePalindrome(int n, String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        Map<String,Integer> palins=new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
    
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if(!palindrome(arr[i])){
                String str = arr[i];
                String rev = new StringBuffer(str).reverse().toString();
        
                if (!map.get(str).equals(map.get(rev))) {
                        return false;
                }
            }
            else
            {
                palins.put(arr[i],palins.getOrDefault(arr[i],0)+1);
            }
        
        }
        
        for(var freq:palins.values())
        {
            if(freq%2==1) cnt++; 
        }
        
        
    
        return cnt<=1;
    }
