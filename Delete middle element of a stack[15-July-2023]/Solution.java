// >> JAVA CODE <<

class Solution
{
    //Function to delete middle element of a stack.
    private void solve(Stack<Integer> s, int sizeOfStack, int midInd) {
        if (sizeOfStack == 0) {
            return;
        }
        
        int el = s.pop();
        solve(s, sizeOfStack - 1, midInd);
        
        if (midInd != sizeOfStack) {
            s.add(el);
        }
    }
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        solve(s,sizeOfStack,(sizeOfStack+1)/2);
    } 
}