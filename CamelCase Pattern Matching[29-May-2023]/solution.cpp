vector<string> CamelCase(int N, vector<string> Dictionary, string Pattern) {
            sort(Dictionary.begin(), Dictionary.end());
    
        vector<string> ans;
        
        for (const string& word : Dictionary) {
            string st = "";
            bool flag = false;
            
            for (char c : word) {
                if (isupper(c)) {
                    st += c;
                }
                
                if (st == Pattern) {
                    flag = true;
                    break;
                }
            }
            
            if (flag) {
                ans.push_back(word);
            }
        }
        
        if (ans.empty()) {
            ans.push_back("-1");
        }
        
        return ans;
    }