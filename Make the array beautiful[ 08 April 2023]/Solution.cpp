//  >> C++ CODE <<

vector<int> makeBeautiful(vector<int> arr) {
        
         vector<int> stack;
         for(int i : arr) {
             if(stack.size() != 0 && ((stack[0] >= 0 && i < 0) || (stack[0] < 0 && i >= 0))) {
                 stack.pop_back();
             } else {
                 stack.push_back(i);
             }
         }
         return stack;
        
    }