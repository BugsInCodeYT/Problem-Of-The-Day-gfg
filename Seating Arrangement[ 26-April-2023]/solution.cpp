//  >> C++ CODE <<


bool is_possible_to_get_seats(int n, int m, vector<int>& seats){
        if (n > m) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        if (m == 1) {
            return seats[0] == 0;
        }
    
        int i = 0;
    
        while (i < m) {
            if (seats[i] == 0) {
                if (i == 0) {
                    if (seats[i + 1] != 1) {
                        n--;
                            if(n==0) return true;
                        seats[i] = 1;
                    }
                } else if (i == m - 1) {
                    if (seats[i - 1] != 1) {
                        n--;
                            if(n==0) return true;
                        seats[i] = 1;
                    }
                } else {
                    if (seats[i - 1] != 1 && seats[i + 1] != 1) {
                        n--;
                            if(n==0) return true;
                        seats[i] = 1;
                    }
                }
            }
            i++;
        }
    
        return n == 0;
    }
