class Solution{
public:
    bool areEqual(vector<int>& a, vector<int>& b) {
        for(int i=0; i<26; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
    
        return true;
    }
    vector<Node*> findAnagrams(Node* head, string s) {
        vector<Node*> ans;
        Node* st = head;
        Node* end = head;
        int i = 0, j = 0;
        vector<int> map(26, 0);
        vector<int> curMap(26, 0);
    
        for(char ch : s) {
            map[ch - 'a']++;
        }
    
        while(end != nullptr) {
            if(j < s.length() - 1) {
                curMap[end->data - 'a']++;
                j++;
                end = end->next;
            }
            else {
                curMap[end->data - 'a']++;
                j++;
    
                if(areEqual(map, curMap)) {
                    ans.push_back(st);
                    Node* next = end->next;
                    end->next = nullptr;
    
                    i = 0;
                    j = 0;
    
                    st = next;
                    end = next;
    
                    fill(curMap.begin(), curMap.end(), 0);
                }
                else {
                    curMap[st->data - 'a']--;
                    i++;
                    st = st->next;
                    end = end->next;
                }
            }
        }
    
        return ans;
    }
};
