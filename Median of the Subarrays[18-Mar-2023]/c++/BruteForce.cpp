//    >> C++ CODE <<

class Solution {
public:
    int findMedian(priority_queue <int, vector<int>, greater<int> > pq) {
        
        if (pq.size() == 1) return pq.top();
        
        vector<int> v;
        while (!pq.empty()) {
            v.push_back(pq.top());
            pq.pop();
        }
        if (v.size() % 2 == 0) return v[(int)(v.size() / 2) - 1];
        
        return v[(int)v.size() / 2];
    }

    long countSubarray(int N, vector<int>& A, int M) {
        long ans = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                priority_queue <int, vector<int>, greater<int> > pq;
                
                for (int k = i; k <= j; k++) {
                    pq.push(A[k]);
                }
                if (pq.size() == 0) continue;
                
                int median = findMedian(pq);
                if (median == M) ans++;
            }
        }
        
        return ans;
    }
};