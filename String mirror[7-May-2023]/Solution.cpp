//  >> C++ CODE <<

string stringMirror(string s){
        string k;
        k += s[0];
        for (int i = 1; i < s.length(); ++i) {
            if (s[0] == s[1]) {
                break;
            }
            if (s[i] <= s[i-1]) {
                k += s[i];
            } else {
                break;
            }
        }
        k += string(k.rbegin(), k.rend());
        return k;
    
    }