//  >> JAVA CODE <<

class Solution
{ 
    static void insertAtLast(Stack<Integer> s,int val)
    {
        if(s.isEmpty()){
            s.add(val);    
            return;
        }
        
        int el=s.pop();
        insertAtLast(s,val);
        s.add(el);
    }
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()) return;
        
        int el=s.pop();
        
        reverse(s);
        
        insertAtLast(s,el);
    }
}