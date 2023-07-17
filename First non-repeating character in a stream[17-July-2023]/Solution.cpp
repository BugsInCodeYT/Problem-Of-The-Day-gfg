//  >>  CPP CODE <<

class Solution {
	public:
		string FirstNonRepeating(string A){
		    int n = A.size();
            vector<int> f(26, 0);
            vector<int> first(26, -1);
    
            string ans = "";
            for (int i = 0; i < n; i++) {

            	if (first[A[i] - 'a'] == -1) {
                    first[A[i] - 'a'] = i;
                }

                f[A[i] - 'a'] += 1;
                char ch = '#';
                int x = n + 1;
                for (int j = 0; j < 26; j++) {
                    if (f[j] == 1 && x > first[j]) {
                        ch = j + 'a';
                        x = first[j];
                    }
                }
    
                ans += ch;
            }
    
            return ans;
	    }

};
