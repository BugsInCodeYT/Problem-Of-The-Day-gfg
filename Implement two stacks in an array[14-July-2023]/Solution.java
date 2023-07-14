//  >> JAVA CODE <<


class twoStacks
{
    int size,top1,top2;
    int[] arr;
    
    twoStacks()
    {
        this.size=100;
        this.arr=new int[size];
        this.top1=-1;
        this.top2=size;
    }
    
    
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
        if(top1==-1) return -1;
        return arr[top1--];
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2==size) return -1;
        return arr[top2++];
    }
}