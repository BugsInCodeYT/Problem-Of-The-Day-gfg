//  >> JAVA CODE <<

String reverseEqn(String s)
{
    
   int i = s.length() - 1;
        StringBuilder ans = new StringBuilder();
        
        while (i >= 0) {
            int num = (int)(s.charAt(i)-'0');
            
            int j = i - 1;
            int pow=1;
            while (j >= 0 && s.charAt(j)>='0' && s.charAt(j)<='9') {
                num += (int)(s.charAt(j)-'0') * Math.pow(10,pow);
                pow++;
                j--;
            }
        
            ans.append(Integer.toString(num));
            
            while (j >= 0 && (s.charAt(j) < '0' || s.charAt(j) > '9')) {
                ans.append(s.charAt(j));
                j--;
            }
            
            i = j;
        }
        
        return ans.toString();
}
