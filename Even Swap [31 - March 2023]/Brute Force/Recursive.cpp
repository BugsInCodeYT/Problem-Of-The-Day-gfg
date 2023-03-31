//		>> Recursive.cpp << 

vector<int> lexicographicallyLargest(vector<int>& a, int n) {
        bool swap=false;
        
        for(int i=0;i<n-1;i++) {
            if((a[i]+a[i+1])%2==0 && a[i]<a[i+1]) {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                swap=true;
            }
        }
        if(!swap) return a;
        return lexicographicallyLargest(a,n);
    }
