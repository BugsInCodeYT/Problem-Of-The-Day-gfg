class Solution{
public:
    bool palindrome(string str)
    {
        int low=0,high=str.length()-1;
        
        while(low<high)
        {
            if(str[low++]!=str[high--])
            return false;
        }
        
        return true;
    }
    
    bool makePalindrome(int n,vector<string>& arr) {
        unordered_map<string, int> map;
        unordered_map<string, int> palins;
        
        for (int i = 0; i < n; i++) {
            string str = arr[i];
            map[str] = map[str] + 1;
        }
    
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if(!palindrome(arr[i])){
                string str = arr[i];
                string rev = string(str.rbegin(), str.rend());
        
                if (map[str] != map[rev]) {
                        return false;
                }
            }
            else
            {
                palins[arr[i]]=palins[arr[i]]+1;
            }
        
        }
        
        for(auto freq:palins)
        {
            if(freq.second%2==1) cnt++; 
        }
            
        return cnt<=1;
    }
};
