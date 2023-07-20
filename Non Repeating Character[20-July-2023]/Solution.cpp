//  >> C++ CODE <<

class Solution
{
    public:
    //Function to find the first non-repeating character in a string.
    char nonrepeatingCharacter(string S)
    {
        vector<int> freq(26, 0);
    
        for (char ch : S)
        {
            freq[ch - 'a']++;
        }
    
        for (char ch : S)
        {
            if (freq[ch - 'a'] == 1)
                return ch;
		}
    
        return '$';
	}

};