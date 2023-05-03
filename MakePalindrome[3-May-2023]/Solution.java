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
        
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
    
        String onePalin="";
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
                if(onePalin.equals(""))
                     onePalin=arr[i];
                if(!onePalin.equals(arr[i]))
                       return false;
                
            }
        }
    
        return true;
    }
