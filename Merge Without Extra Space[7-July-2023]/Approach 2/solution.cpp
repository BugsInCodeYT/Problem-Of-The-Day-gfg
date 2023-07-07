// >> C++ CODE <<

class Solution{
    public:
        //Function to merge the arrays.
        void merge(long long arr1[], long long arr2[], int n, int m) 
        { 
            int i = 0;
        int j = 0;
        int k = 0;
        // for Euclid's division lemma
        int mod = (int) (10e7 + 1);
        
        // In this loop, we are rearranging the elements of arr1
        while (i < n && (j < n && k < m)) {
            // if both arr1 and arr2 elements are modified
            if (arr1[j] >= mod && arr2[k] >= mod) {
                if (arr1[j] % mod <= arr2[k] % mod) {
                    arr1[i] += (arr1[j] % mod) * mod;
                    j++;
                } else {
                    arr1[i] += (arr2[k] % mod) * mod;
                    k++;
                }
            }
            // if only arr1 elements are modified
            else if (arr1[j] >= mod) {
                if (arr1[j] % mod <= arr2[k]) {
                    arr1[i] += (arr1[j] % mod) * mod;
                    j++;
                } else {
                    arr1[i] += (arr2[k] % mod) * mod;
                    k++;
                }
            }
            // if only arr2 elements are modified
            else if (arr2[k] >= mod) {
                if (arr1[j] <= arr2[k] % mod) {
                    arr1[i] += (arr1[j] % mod) * mod;
                    j++;
                } else {
                    arr1[i] += (arr2[k] % mod) * mod;
                    k++;
                }
            }
            // if none of the elements are modified
            else {
                if (arr1[j] <= arr2[k]) {
                    arr1[i] += (arr1[j] % mod) * mod;
                    j++;
                } else {
                    arr1[i] += (arr2[k] % mod) * mod;
                    k++;
                }
            }
            i++;
        }
        
        // We can copy the elements directly when the other array is exhausted
        while (j < n && i < n) {
            arr1[i] += (arr1[j] % mod) * mod;
            i++;
            j++;
        }
        
        while (k < m && i < n) {
            arr1[i] += (arr2[k] % mod) * mod;
            i++;
            k++;
        }
        
        // We need to reset i
        i = 0;
        
        // In this loop, we are rearranging the elements of arr2
        while (i < m && (j < n && k < m)) {
            // if both arr1 and arr2 elements are modified
            if (arr1[j] >= mod && arr2[k] >= mod) {
                if (arr1[j] % mod <= arr2[k] % mod) {
                    arr2[i] += (arr1[j] % mod) * mod;
                    j++;
                } else {
                    arr2[i] += (arr2[k] % mod) * mod;
                    k++;
                }
            }
            // if only arr1 elements are modified
            else if (arr1[j] >= mod) {
                if (arr1[j] % mod <= arr2[k]) {
                    arr2[i] += (arr1[j] % mod) * mod;
                    j++;
                } else {
                    arr2[i] += (arr2[k] % mod) * mod;
                    k++;
                }
            }
            // if only arr2 elements are modified
            else if (arr2[k] >= mod) {
                if (arr1[j] <= arr2[k] % mod) {
                    arr2[i] += (arr1[j] % mod) * mod;
                    j++;
                } else {
                    arr2[i] += (arr2[k] % mod) * mod;
                    k++;
                }
            }
            // if none of the elements are modified
            else {
                if (arr1[j] <= arr2[k]) {
                    arr2[i] += (arr1[j] % mod) * mod;
                    j++;
                } else {
                    arr2[i] += (arr2[k] % mod) * mod;
                    k++;
                }
            }
            i++;
        }
        
        // We can copy the elements directly when the other array is exhausted
        while (j < n && i < m) {
            arr2[i] += (arr1[j] % mod) * mod;
            i++;
            j++;
        }
        
        while (k < m && i < m) {
            arr2[i] += (arr2[k] % mod) * mod;
            i++;
            k++;
        }
        
        // We need to reset i
        i = 0;
        
        // We need to divide the whole arr1 by mod
        while (i < n) {
            arr1[i] = arr1[i] / mod;
            i++;
        }
        
        // We need to reset i
        i = 0;
        
        // We need to divide the whole arr2 by mod
        while (i < m) {
            arr2[i] = arr2[i] / mod;
            i++;
        }
        } 
};