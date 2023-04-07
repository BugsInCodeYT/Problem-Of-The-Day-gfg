//	>> C++ CODE <<

bool isPalindrome(string str, int low, int high)
        {
            while (low < high)
            {
                if (str[low++] != str[high--])
                    return false;
            }
            return true;
        }
        
        int addMinChar(string str)
        {
            int plen = 1;
            for (int i = 1; i < str.length(); i++)
            {
                if (isPalindrome(str, 0, i))
                {
                    plen = i + 1;
                }
            }
            return str.length() - plen;
        }