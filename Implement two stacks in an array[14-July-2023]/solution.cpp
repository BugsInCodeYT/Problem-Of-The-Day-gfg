//  >> PYTHON CODE <<

class twoStacks
{
    int *arr;
    int size;
    int top1, top2;
    public:
    
    twoStacks(int n=100)
    {
        size = n; 
        arr = new int[n]; 
        top1 = -1; 
        top2 = size;
    }
 
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        if(top1>=top2) return;
        arr[++top1]=x;
    }
    
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       if(top1>=top2) return;
        
       arr[--top2]=x;
    }
    
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        return top1==-1?-1:arr[top1--];
    }
    
    //Function to remove an element from top of the stack2.
    int pop2()
    {
       return top2==size?-1:arr[top2++];
    }
};
