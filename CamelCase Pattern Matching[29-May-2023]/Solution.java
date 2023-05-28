 ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        
        Arrays.sort(Dictionary);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for (String word : Dictionary) {
            String st = "";
            boolean flag = false;
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    st += c;
                }
                
                if (st.equals(Pattern)) {
                    flag = true;
                    break;
                }
            }
            
            if (flag) {
                ans.add(word);
            }
        }
        
        if (ans.isEmpty()) {
            ans.add("-1");
        }
        
        return ans;
        
    }