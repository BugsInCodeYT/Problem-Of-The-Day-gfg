class Solution{
    public:
    
        int solve(int i, vector<int>& arr, int N)
        {
            if(i > N) return 0;
            
            int max_cost = INT_MIN;
            
            for(int b = i; b <= N; b++)
            {
                int cost = arr[b] * arr[i-1] * arr[N+1] + solve(b+1, arr, N) + solve(i, arr, b-1);
                max_cost = max(max_cost, cost);
            }
            
            return max_cost;
        }
        int maxCoins(int N, vector <int> &arr)
        {
                 arr.insert(arr.begin(), 1);
                arr.push_back(1);
                
                return solve(1, arr, N);
        }
};