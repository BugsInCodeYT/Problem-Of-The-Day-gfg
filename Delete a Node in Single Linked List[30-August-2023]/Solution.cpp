//   >> CPP CODE <<

Node* deleteNode(Node *head,int x)
{
    if(x==1) return head->next;
    
    Node* prev=NULL;
    Node* ptr=head;
    
    while(x>1)
    {
        prev=ptr;
        ptr=ptr->next;
        x-=1;
    }
    
    prev->next=ptr->next;
    
    return head;
}