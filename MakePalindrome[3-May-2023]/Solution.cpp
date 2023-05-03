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
    
    bool makePalindrome(int n, vector<string>& arr) {
        map<string, int> map;
        
        for (int i = 0; i < n; i++) {
            string str = arr[i];
            map[str] = map[str] + 1;
        }
    
        string onePalin="";
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
                if(onePalin=="")
                     onePalin=arr[i];
                if(onePalin!=arr[i])
                       return false;
                
            }
        }
    
        return true;
    }
};
