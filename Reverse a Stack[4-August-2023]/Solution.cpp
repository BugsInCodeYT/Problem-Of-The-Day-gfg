//  C++ CODE <<

class Solution{
public:
    void insertAtLast(stack<int> &St,int val){
        if(St.size()==0){
            St.push(val);
            return;
        }
        
            int el=St.top();
            St.pop();
            insertAtLast(St,val);
            St.push(el);
    }
    
    void Reverse(stack<int> &St){
        if(St.size()==0) return;
        
        int el=St.top();
        St.pop();
        
        Reverse(St);
        
        insertAtLast(St,el);
    }
};
