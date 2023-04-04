//	C++ CODE <<

int minSteps(string str) {
    int acount = 0;
    int bcount = 0;
    char prev = '#';

    for(int i = 0; i < str.length(); i++) {
        char ch = str[i];
        if(prev == ch) continue;
        
        if(ch == 'a') acount++;
        else bcount++;
        
        prev = ch;
    }

    return min(acount, bcount) + 1;
}