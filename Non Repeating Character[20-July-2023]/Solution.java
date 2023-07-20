//  >> JAVA CODE <<

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        int[] freq=new int[26];
        
        for(char ch:S.toCharArray())
        {
            freq[ch-'a']++;
        }
        
        for(char ch:S.toCharArray())
            if(freq[ch-'a']==1) return ch;
            
            return '$';
    }
}