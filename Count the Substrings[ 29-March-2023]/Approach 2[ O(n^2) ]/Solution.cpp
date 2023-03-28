// 		>> C++ CODE <<

int countSubstring(string S)
    {
        int ans=0;
        for(int i=0;i<S.size();i++)
        {
            int c=0;
            for(int j=i;j<S.size();j++)
            {
                if(S[j]>='a'&&S[j]<='z')
                    c++;
                else
                    c--;
                if(c==0)
                    ans++;
            }
        }
        return ans;
    }