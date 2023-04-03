//    >> C++ CODE <<

int xmod11(string x)
    {
        int n=x.length();
        
        int r=0;
        
        for(int i=0;i<n;i++)
        {
            int num=r*10+(int)(x[i]-'0');
            r=num%11;
        }
        
        return r;
    }