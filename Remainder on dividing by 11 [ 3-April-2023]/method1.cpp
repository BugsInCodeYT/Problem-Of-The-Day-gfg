//   >> C++ CODE <<

int xmod11(string x)
    {
       int val1 = 0;
        int val2 = 0;
        
        for (int i = 0; i < x.length(); i++) {
            if (i % 2 == 0) {
                val1 += (int)(x[i] - '0');
            } else {
                val2 += (int)(x[i] - '0');
            }
        }
        
        return ((val2 - val1) % 11 >= 0) ? 
                        (val2 - val1) % 11 : (val2 - val1) % 11 + 11;
    }