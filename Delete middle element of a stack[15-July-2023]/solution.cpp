//   >> C++ CODE <<

class Solution
{
    public:
    //Function to delete middle element of a stack.
    void solve(stack<int>& s, int sizeOfStack, int midInd) {
        if (sizeOfStack == 0) {
            return;
        }
        
        int el = s.top();
        s.pop();
        solve(s, sizeOfStack - 1, midInd);
        
        if (midInd != sizeOfStack) {
            s.push(el);
        }
    }
    void deleteMid(stack<int>&s, int sizeOfStack)
    {
        return solve(s,sizeOfStack,(sizeOfStack+1)/2);
    }
};