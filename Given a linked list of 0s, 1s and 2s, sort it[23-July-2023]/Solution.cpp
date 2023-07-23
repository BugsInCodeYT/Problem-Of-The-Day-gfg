//  >> CPP CODE <<

class Solution
{
    public:
    //Function to sort a linked list of 0s, 1s and 2s.
    Node* segregate(Node* head) {
        Node* zeroList = new Node(-1);
        Node* oneList = new Node(-1);
        Node* twoList = new Node(-1);
        Node* zeroptr = zeroList;
        Node* oneptr = oneList;
        Node* twoptr = twoList;

        while (head) {
            if (head->data == 0) {
                zeroptr->next = head;
                zeroptr = zeroptr->next;
            } else if (head->data == 1) {
                oneptr->next = head;
                oneptr = oneptr->next;
            } else {
                twoptr->next = head;
                twoptr = twoptr->next;
            }

            head = head->next;
        }


        if (zeroList->next != nullptr) {
            if (oneList->next != nullptr) {
                zeroptr->next = oneList->next;
                oneptr->next = twoList->next;
            } else {
                zeroptr->next = twoList->next;
            }
            
            twoptr->next = nullptr;
            return zeroList->next;
        } else if (oneList->next != nullptr) {
            oneptr->next = twoList->next;
            twoptr->next = nullptr;
            
            return oneList->next;
        } else {
            twoptr->next = nullptr;
            return twoList->next;
        }
    }

};