void getValueAt(Node* root,int* med,int* pos)
{
    if(root==NULL) return;
    
    getValueAt(root->left,med,pos);
    if(pos[0]==0)
    {
        if(med[0]==-1) med[0]=root->data;
        else med[1]=root->data;
    }
    pos[0]--;
    getValueAt(root->right,med,pos);
}

int getCount(Node* root)
{
    if(root==NULL) return 0;
    
    return 1+getCount(root->left)+getCount(root->right);
}

float findMedian(Node* root)
{
    int n=getCount(root);
    int med[]={-1,-1};
    if(n%2==0)
    {
        getValueAt(root,med,new int{n/2-1});
        getValueAt(root,med,new int{n/2});
        int median=med[0]+med[1];
        return median%2==0?(median/2):(float)((double)median/2);
    }
    else
    {
        getValueAt(root,med,new int{(n+1)/2-1});
        return med[0];
    }
}