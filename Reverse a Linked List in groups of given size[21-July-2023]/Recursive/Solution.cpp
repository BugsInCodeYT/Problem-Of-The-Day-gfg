//  >> C++ RECURSIVE APPROACH <<

class Solution {
public:
    struct node* reverse(struct node* head, int k) {
        if (head == nullptr) return nullptr;
        
        struct node* prev = nullptr;
        struct node* next = nullptr;
        struct node* headptr = head;
        int cnt = k;
        
        while (headptr != nullptr && cnt != 0) {
            next = headptr->next;
            headptr->next = prev;
            prev = headptr;
            headptr = next;
            cnt--;
        }
        
        head->next = reverse(headptr, k);
        
        return prev;
    }
};