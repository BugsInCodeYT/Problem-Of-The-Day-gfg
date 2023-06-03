//  >> C++ CODE <<

int maxEqualSum(int N1,int N2,int N3,vector<int> &S1,vector<int> &S2,vector<int> &S3){
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i : S1) sum1 += i;
        for (int i : S2) sum2 += i;
        for (int i : S3) sum3 += i;
        int i = 0, j = 0, k = 0;
    
        while (i < S1.size() && j < S2.size() && k < S3.size()) {
            if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }
    
            int max_sum = max({sum1, sum2, sum3});
    
            if (max_sum == sum1) {
                sum1 -= S1[i];
                i++;
            } else if (max_sum == sum2) {
                sum2 -= S2[j];
                j++;
            } else {
                sum3 -= S3[k];
                k++;
            }
        }
    
        return 0;
    }