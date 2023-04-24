//    >> C++ CODE <<


vector<int> nearestSmallerTower(vector<int>& arr) {
    int n = arr.size();
    vector<int> left(n, -1), right(n, n);
    stack<int> s;
    
    // fill left array
    for (int i = 0; i < n; i++) {
        while (!s.empty() && arr[s.top()] >= arr[i]) {
            s.pop();
        }
        if (!s.empty()) {
            left[i] = s.top();
        }
        s.push(i);
    }
    
    // clear the stack and fill right array
    while (!s.empty()) s.pop();
    for (int i = n - 1; i >= 0; i--) {
        while (!s.empty() && arr[s.top()] >= arr[i]) {
            s.pop();
        }
        if (!s.empty()) {
            right[i] = s.top();
        }
        s.push(i);
    }
    
    vector<int> ans(n);
    for (int i = 0; i < n; i++) {
        if (left[i] == -1 && right[i] == n) {
            ans[i] = -1;
        } else if (left[i] == -1) {
            ans[i] = right[i];
        } else if (right[i] == n) {
            ans[i] = left[i];
        } else if (i - left[i] == right[i] - i) {
            if (arr[left[i]] < arr[right[i]]) {
                ans[i] = left[i];
            } else if (arr[left[i]] == arr[right[i]]) {
                ans[i] = min(left[i], right[i]);
            } else {
                ans[i] = right[i];
            }
        } else {
            if (i - left[i] < right[i] - i) {
                ans[i] = left[i];
            } else {
                ans[i] = right[i];
            }
        }
    }
    return ans;
}
