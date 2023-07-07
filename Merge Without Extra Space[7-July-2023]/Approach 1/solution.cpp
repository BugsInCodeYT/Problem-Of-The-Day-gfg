//  >> C++ CODE <<

class Solution{
    public:
        //Function to merge the arrays.
        void merge(long long arr1[], long long arr2[], int n, int m) 
        { 
            int i = 0, j = 0, k = n - 1;
        
            while (i <= k && j < m) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else {
                    swap(arr1[k], arr2[j]);
                    j++;
                    k--;
                }
            }
            
            sort(arr1, arr1 + n);
            sort(arr2, arr2 + m);
        } 
};