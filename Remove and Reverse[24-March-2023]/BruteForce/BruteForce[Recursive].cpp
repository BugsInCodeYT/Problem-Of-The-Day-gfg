// >> Brute Force Recursive code c++ <<

class Solution {
public:
    string removeReverse(string S) {
        unordered_map<char,int> map;
        int index=INT_MAX;
        for(int i=0;i<S.length();i++) {
            if(map.find(S[i]) != map.end()) {
                if(index>map[S[i]])
                    index=map[S[i]];
            }
            else {
                map[S[i]]=i;
            }
        }

        if(index==INT_MAX) {
            return S;
        }

        string sb="";
        for(int i=S.length()-1;i>=0;i--) {
            if(i==index) continue;
            sb+=S[i];
        }

        return removeReverse(sb);
    }
};