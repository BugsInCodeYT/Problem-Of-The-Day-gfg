//			>> C++ CODE <<

class Solution{
public:
    static int operations(char str[],int k,int m)
    {
        int low=0,high=strlen(str)-1;
        int ans=0;
        while(low<high)
        {
            if(str[low]!=str[high])
            {
                if(low>=k && high<=(k+m-1)) return INT_MAX/2;
                ans++;
            }
            low++; high--;
        }
        return ans;
    }

    static int specialPalindrome(string a, string b)
    {
        int min=INT_MAX/2;
        int n=a.length(),m=b.length();
        if(n<m) return -1;
        for(int i=0;i<=n-m;i++)
        {
            int ans=0;
            char tmp[n+1];
            strcpy(tmp, a.c_str());
            int k=i;
            for(int j=0;j<m;j++)
            {
                if(tmp[k]==b[j])
                {
                    k++;
                    continue;
                }
                ans++;
                tmp[k]=b[j];
                k++;
            }
            ans+=operations(tmp,i,m);
            min=min<ans?min:ans;
        }
        return min==INT_MAX/2?-1:min;
    }
};