//		>> C++ CODE <<

class Solution{   
public:
    vector<long> get(int c1, int c2, string S) {

        long cnt1 = 0, cnt2 = 0;
        stack<char> s1, s2;
        s1.push(S[0]);
        char temp = S[0];
        
        for (int i = 1; i < S.length(); i++) {
            if (!s1.empty() && S[i] == c2 && s1.top() == c1) {
                s1.pop();
                cnt1++;
            } else {
                s1.push(S[i]);
            }
        }
        
        s2.push(s1.top());
        temp = s2.top();
        s1.pop();
        
        while (!s1.empty()) {
            if (!s2.empty() && s1.top() == c2 && s2.top() == c1) {
                cnt2++;
                s2.pop();
            } else {
                s2.push(s1.top());
            }
            s1.pop();
        }
        
        vector<long> ans;
        
        if (c1 == 'p') {
            ans.push_back(cnt1); ans.push_back(cnt2);
        } else {
            ans.push_back(cnt2); ans.push_back(cnt1);
        }
     
            return ans;   
    }
    
    long long solve(int X, int Y, string S) {
        
        vector<long> elements;
        
        
        if(X>Y) elements=get('p','r',S);
        else elements=get('r','p',S);
        
        return elements[0]*X + elements[1]*Y;
    }
};