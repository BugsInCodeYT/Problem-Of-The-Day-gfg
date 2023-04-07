//		>> C++ CODE <<

int computeLPSArray(string str)
    {
        int n = str.length();
        int lps[n];
        int len = 0;
        int i = 1;
        lps[0] = 0;
        
        while (i < n)
        {
            if (str[i] == str[len])
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if (len > 0)
                {
                    len = lps[len-1];
                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps[n-1];
    }
    
    int addMinChar(string str)
    {
        string revStr = str;
        reverse(revStr.begin(), revStr.end());
        string newString = str + "$" + revStr;
        int lpfs = computeLPSArray(newString);
        return str.length() - lpfs;
    }