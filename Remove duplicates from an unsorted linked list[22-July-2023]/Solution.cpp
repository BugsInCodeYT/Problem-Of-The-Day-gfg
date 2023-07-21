//  >> CPP CODE <<

class Solution
{
    public:
    //Function to remove duplicates from unsorted linked list.
     Node* removeDuplicates(Node* head) {
        Node* ansList = new Node(-1);
        Node* ansptr = ansList;
        unordered_set<int> st;

        while (head) {
            if (st.find(head->data) == st.end()) {
                st.insert(head->data);
                ansptr->next = head;
                ansptr = ansptr->next;
            }

            head = head->next;
        }

        ansptr->next = nullptr;

        return ansList->next;
    }
};