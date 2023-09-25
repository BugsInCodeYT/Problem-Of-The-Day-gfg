//   >> CPP CODE <<

class Solution {
  public:
    vector<int> maxCombinations(int N, int K, vector<int> &A, vector<int> &B) {
        
        sort(A.begin(),A.end());
        sort(B.begin(),B.end());
        
        vector<int>ans;
        priority_queue<pair<int,int>>pq;
        
        for(int i=0;i<N;i++)
        {
            int sum = A[i]+B[N-1];
            pq.push({sum,N-1});
        }
        
        while(!pq.empty() and K--)
        {
            int sum = pq.top().first;
            int ind = pq.top().second;
            pq.pop();
            ans.push_back(sum);
            if(ind-1>=0)
            pq.push({sum-B[ind]+B[ind-1], ind-1});
        }
        
        
        return ans;
    }
};