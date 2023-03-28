//		>> JAVA CODE <<

int countSubstring(String S) 
    { 
        int ans=0;
        for(int i=0;i<S.length();i++)
        {
            for(int j=i+1;j<S.length();j++)
            {
                int ucase=0,lcase=0;
                for(int k=i;k<=j;k++)
                {
                    if(Character.isUpperCase(S.charAt(k)))
                    {
                        ucase++;
                    }
                    else
                    {
                        lcase++;
                    }
                }
                if(ucase==lcase) ans++;
            }
        }
        return ans;
    }