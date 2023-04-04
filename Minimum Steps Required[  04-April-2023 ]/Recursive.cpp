//   >> C++ CODE <<

int minSteps(string str) {
    
    int n = str.length();
    if (n == 0 || n == 1) {
        return n;
    }
    
    int minStps = INT_MAX/2;
    for (int i = 0; i < n;) {
        int j = i+1;
        while(j < n && str[j] == str[i]) {
            j++;
        }
        string newString = str.substr(0, i) + str.substr(j);
        minStps = min(minStps, 1 + minSteps(newString));
        i = j;
    }
    return minStps;
    
}