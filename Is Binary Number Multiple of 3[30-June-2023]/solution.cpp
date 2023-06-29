//   >> C++ CODE <<

int isDivisible(string s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '1') {
            if (i % 2 == 0) {
                sum += 1;
            } else {
                sum += 2;
            }
        }
    }
    
    return sum % 3 == 0 ? 1 : 0;
}