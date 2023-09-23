//  >> CPP CODE <<

class Solution{
    public:
    int equilibriumPoint(long long a[], int n) {
    
        long long sumArray=0;
        
        for(int i=0;i<n;i++) sumArray+=a[i];
        
        long long ss=0;
        
        for(int i=0;i<n;i++)
        {
            if(ss==sumArray-ss-a[i]) return i+1;
            ss+=a[i];
        }
        
            return -1;
    }

};