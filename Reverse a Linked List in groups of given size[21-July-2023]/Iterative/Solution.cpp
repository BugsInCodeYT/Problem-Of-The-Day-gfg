//  >> C++ ITERATIVE APPROACH <<

class Solution
{
    public:
    struct node* reverseList(struct node *head) {
        struct node* prev = nullptr;
        struct node* next = nullptr;
        struct node* ptr = head;

        while (ptr) {
            next = ptr->next;
            ptr->next = prev;
            prev = ptr;
            ptr = next;
        }

        return prev;
    }

    struct node *reverse (struct node *head, int k)
    { 
        struct node* nn = head;
        struct node* ans =new struct node(-1);
        struct node* ansPtr = ans;

        while (nn != nullptr) {
            struct node* start = nn;
            struct node* end = nn;

            int cnt = k;
            while (end != nullptr && cnt != 1) {
                end = end->next;
                cnt--;
            }

            if (end != nullptr) {
                nn = end->next;
                end->next = nullptr;
            } else {
                nn = nullptr;
            }
            
            ansPtr->next = reverseList(start);
            ansPtr = start;
        }

        return ans->next;
    }
};
