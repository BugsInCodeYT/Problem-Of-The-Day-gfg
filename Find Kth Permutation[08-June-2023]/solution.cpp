//  >> C++ CODE <<

string kthPermutation(int n, int k)
    {
        vector<int> al;
        int f = 1;
        for (int i = 1; i < n; i++) {
          f *= i;
          al.push_back(i);
        }
        al.push_back(n);
        string ans = "";
        k = k - 1;
        while (al.size() > 0) {
            int idx = al[k / f];
            al.erase(al.begin() + k / f);
            ans += to_string(idx);
            if (al.size() == 0)
                break;
            k = k % f;
            f = f / al.size();
    }
    
        return ans;
    }