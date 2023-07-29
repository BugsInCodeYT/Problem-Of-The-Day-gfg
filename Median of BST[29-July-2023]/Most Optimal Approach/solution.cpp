int countNodes(Node* root)
{
    Node* cur=root;
    int count=0;
    while(cur!=NULL)
    {
        if(cur->left!=NULL)
        {
            Node* temp=cur->left;
            
            while(temp->right!=NULL && temp->right!=cur)
            {
                temp=temp->right;
            }
            
            if(temp->right==NULL)
            {
                temp->right=cur;
                cur=cur->left;
            }
            else
            {
                temp->right=NULL;
                count++;
                cur=cur->right;
            }
        }
        else
        {
            count++;
            cur=cur->right;
        }
    }
    
        return count;
}
float findMedian(Node* root)
{
    int nodes=countNodes(root);
    
    int req=nodes/2;
    int prev=-1;
    int current=-1;
    
    Node* cur=root;
    while(cur!=NULL)
    {
        if(cur->left!=NULL)
        {
            Node* temp=cur->left;
            
            while(temp->right!=NULL && temp->right!=cur)
            {
                temp=temp->right;
            }
            
            if(temp->right==NULL)
            {
                temp->right=cur;
                cur=cur->left;
            }
            else
            {
                temp->right=NULL;
                
                prev=current;
                current=cur->data;
                
                req--;
                if(req<0) break;
                cur=cur->right;
            }
        }
        else
        {
            prev=current;
            current=cur->data;
            
            req--;
            if(req<0) break;
                
            cur=cur->right;
        }
    }
    
    if(nodes%2==0)
    {
        return (prev+current)/2.0f; 
    }
    
    return current;

}