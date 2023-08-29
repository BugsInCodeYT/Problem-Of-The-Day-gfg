//  >> CPP CODE <<

class Solution
{
    public:
    Node* reverse(Node* head) {
        Node* prev = nullptr;
        Node* next = nullptr;
    
        while (head != nullptr) {
            next = head->next;
            head->next = prev;
            prev = head;
            head = next;
        }
    
        return prev;
    }
    
    Node* compute(Node* head) {
        Node* rev = reverse(head);
        Node* ans = new Node(-1);
        Node* ptr = ans;
    
        while (rev != nullptr) {
            if (rev->data >= ptr->data) {
                ptr->next = rev;
                ptr = ptr->next;
            }
    
            rev = rev->next;
        }
    
        ptr->next = nullptr;
    
        return reverse(ans->next);
    }
    
};