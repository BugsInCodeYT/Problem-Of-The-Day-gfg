//			>> C++ CODE <<

vector<int> getDistinctDifference(int N,vector<int>& A) {
    vector<int> ans;
    unordered_set<int> s;
    unordered_map<int, int> m;
    for (int i = 0; i < N; i++) m[A[i]]++;
    
    for (int i = 0; i < N; i++) {
        m[A[i]]--;
        if (m[A[i]] == 0) m.erase(A[i]);
        
        int left = s.size();
        int right = m.size();
        
        ans.push_back(left - right);
        
        s.insert(A[i]);
    }
    return ans;
}