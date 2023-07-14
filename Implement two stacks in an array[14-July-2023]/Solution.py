#  >>  PYTHON CODE <<

class TwoStacks:
    def __init__(self, n=100):
        self.size = n
        self.arr = [0] * n
        self.top1 = -1
        self.top2 = n

    # Function to push an integer into stack 1
    def push1(self, x):
        if(self.top1>=self.top2): return
    
        self.top1=self.top1+1
        self.arr[self.top1]=x

    # Function to push an integer into stack 2
    def push2(self, x):
        if(self.top1>=self.top2): return
    
        self.top2=self.top2-1
        self.arr[self.top2]=x

    # Function to remove an element from top of stack 1
    def pop1(self):
        if(self.top1==-1): return -1
        
        deleted_value=self.arr[self.top1]
        self.top1-=1
        
        return deleted_value

    # Function to remove an element from top of stack 2
    def pop2(self):
        if(self.top2==self.size): return -1
        
        deleted_value=self.arr[self.top2]
        self.top2+=1
        
        return deleted_value
