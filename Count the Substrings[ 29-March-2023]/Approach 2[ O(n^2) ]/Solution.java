// 	>> JAVA CODE <<  

int countSubstring(String S) 
    { 
        int ans=0;
        for(int i=0;i<S.length();i++)
        {
            int c=0;
            for(int j=i;j<S.length();j++)
            {
                if(Character.isLowerCase(S.charAt(j)))
                    c++;
                else
                    c--;
                    
                if(c==0)
                    ans++;
            }
        }
        return ans;
    }