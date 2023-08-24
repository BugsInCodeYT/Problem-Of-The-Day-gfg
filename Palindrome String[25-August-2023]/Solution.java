//  >> JAVA CODE <<

class Solution {
    int isPalindrome(String S) {
        int low=0,high=S.length()-1;
        
        while(low<high)
        {
            if(S.charAt(low)!=S.charAt(high)) return 0;
            low++;
            high--;
        }
        
        return 1;
    }
};