//  >> CPP CODE <<

class Solution{
    public:
    int maxOnes(int a[], int n)
    {
        int mx=0;
        int cnt1=0;
        
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==0) sum+=1;
            else{
             cnt1++;   
             sum+=(-1);
            }
            
            mx=max(mx,sum);
            
            if(sum<0) sum=0;
        }
        
        return mx+cnt1;
        
        
    }
};