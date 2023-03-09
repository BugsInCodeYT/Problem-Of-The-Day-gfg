class Solution {
  public:
  vector<Node*> findAnagrams(Node* head,string s) {
    vector<Node*> ans;
    vector<int> map(26, 0);
    vector<int> listMap(26, 0);

   
    for(char ch : s) {
        map[ch - 'a']++;
    }

    int length = 0;
    for(int i=0; i<26; i++) {
        if(map[i] > 0) {
            length++;
        }
    }

    Node* st = head;
    Node* end = head;
    int cnt = 0;

    while(end != nullptr) {
        listMap[end->data - 'a']++;

        if(map[end->data - 'a'] == listMap[end->data - 'a']) {
            cnt++;
        }

        while(map[end->data - 'a'] < listMap[end->data - 'a']) {
            if(map[st->data - 'a'] == listMap[st->data - 'a']) {
                cnt--;
            }

            listMap[st->data - 'a']--;
            st = st->next;
        }

        if(cnt == length) {
            ans.push_back(st);
            Node* next = end->next;
            end->next = nullptr;
            st = next;
            end = next;
            cnt = 0;
            fill(listMap.begin(), listMap.end(), 0);
        }
        else {
            end = end->next;
        }
    }

    return ans;
}

};