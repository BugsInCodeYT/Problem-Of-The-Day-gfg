vector<int> lexicographicallyLargest(vector<int>& a, int n) {
        bool swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] < a[i+1] && (a[i] + a[i+1]) % 2 == 0) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swapped = true;
                }
            }
        }


        return a;
    }