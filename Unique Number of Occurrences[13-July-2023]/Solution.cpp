//   >> CPP CODE <<

class Solution
{
    public:
    bool isFrequencyUnique(int n, int arr[])
    {
         unordered_map<int, int> mp;
    
        for (int i = 0; i < n; i++) {
            mp[arr[i]] = mp[arr[i]] + 1;
        }
        
        unordered_set<int> st;
        
        for (const auto& pair : mp) {
            int key = pair.second;
            if (st.count(key)) {
                return false;
            }
            st.insert(key);
        }
        
        return true;
    }
};