//  >> CPP CODE <<

class Solution
{
    public:
    //Function to return list containing first n fibonacci numbers.
    vector<long long> printFibb(int n) 
    {
        vector<long long> ans(n);

        if (n == 1) {
            ans[0] = 1;
            return ans;
        }

        ans[0] = 1;
        ans[1] = 1;

        for (int i = 2; i < n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }

        return ans;
    }
};