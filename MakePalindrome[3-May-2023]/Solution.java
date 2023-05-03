public static boolean makePalindrome(int n, String[] arr) {
        Map<String, Integer> map = new HashMap<>();
    
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
    
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            String rev = new StringBuffer(str).reverse().toString();
    
            if (!map.get(str).equals(map.get(rev))) {
                    return false;
            }
        }
    
        return true;
    }
