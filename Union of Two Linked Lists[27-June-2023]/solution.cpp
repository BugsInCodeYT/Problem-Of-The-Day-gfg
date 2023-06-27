//  >> C++ CODE <<

class Solution {
public:
    Node* makeUnion(Node* head1, Node* head2) {
        Node* merged = merge(head1, head2);
        Node* sorted = sort(merged);
        return sorted;
    }

private:
    Node* merge(Node* a, Node* b) {
        if (a == nullptr)
            return b;
        if (b == nullptr)
            return a;

        Node* ans = nullptr;

        if (a->data < b->data) {
            ans = a;
            ans->next = merge(a->next, b);
        } else if (b->data < a->data) {
            ans = b;
            ans->next = merge(a, b->next);
        } else {
            ans = a;
            ans->next = merge(a->next, b->next);
        }

        return ans;
    }

    Node* sort(Node* head) {
        if (head == nullptr || head->next == nullptr)
            return head;

        Node* slow = head;
        Node* fast = head->next;

        while (fast != nullptr && fast->next != nullptr) {
            fast = fast->next->next;
            slow = slow->next;
        }

        Node* mid = slow;
        Node* nextToMid = mid->next;
        mid->next = nullptr;

        Node* first = sort(head);
        Node* second = sort(nextToMid);

        Node* ans = merge(first, second);

        return ans;
    }
};