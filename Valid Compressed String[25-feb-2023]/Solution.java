
class Solution {
    static int checkCompressed(String S, String T) {
        
        int i=0,j=0;
        
        while(i<S.length() && j<T.length())
        {
            if(Character.isDigit(T.charAt(j)))
            {
                int count=0;
                while(j<T.length() && Character.isDigit(T.charAt(j)))
                {
                    count=count*10+(int)(T.charAt(j)-'0');
                    j++;
                }
                
                i+=count;
            }
            else
            {
                if(S.charAt(i) != T.charAt(j)) return 0;
                else
                {
                    i++; j++;
                }
            }
        }
        
            return (i==S.length() && j==T.length())?1:0; 
    }
}