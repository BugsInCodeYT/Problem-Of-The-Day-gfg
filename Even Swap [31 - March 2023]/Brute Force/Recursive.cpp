//		>> Recursive.cpp << 

vector<int> lexicographicallyLargest(vector<int>& a, int n) {
        vector<int> ans(n);
        for(int i=0;i<n;i++) ans[i]=a[i];
        for(int i=0;i<n-1;i++) {
            if((a[i]+a[i+1])%2==0 && a[i]<a[i+1]) {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        if(a==ans) return ans;
        return lexicographicallyLargest(a,n);
    }