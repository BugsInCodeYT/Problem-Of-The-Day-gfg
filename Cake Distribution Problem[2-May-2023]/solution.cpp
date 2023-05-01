//  >> C++ CODE <<


int maxSweetness(vector<int>& sweetness, int n, int k) {
    int low = 0, high = 1e9, ans = -1;

    auto good = [&](int x) -> bool {
        int s = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            s += sweetness[i];
            if (s >= x) {
                s = 0;
                cnt++;
            }
        }

        return cnt >= k + 1;
    };

    while (low <= high) {
        int mid = (low + high) / 2;
        if (good(mid)) {
            low = mid + 1;
            ans = mid;
        }
        else {
            high = mid - 1;
        }
    }

    return ans;
}