//  >> CPP CODE <<

Node *removeDuplicates(Node *head)
{
 
        Node* ans = new Node(-1);
        Node* ansptr = ans;
        
        while (head != nullptr) {
            if (head->data != ansptr->data) {
                ansptr->next = head;
                ansptr = ansptr->next;
            }
            
            head = head->next;
        }
        
        ansptr->next = nullptr;
        
        return ans->next;

}