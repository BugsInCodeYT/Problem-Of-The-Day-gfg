//   >> C++ CODE <<


class Solution {
  public:
    
    class Pair {
        public:
            int color;
            int radius;
        
            Pair(int color, int radius) {
                this->color = color;
                this->radius = radius;
            }
    };
    
    int finLength(int N, vector<int>& color, vector<int>& radius) {
        stack<Pair> stack;
    
        for (int i = 0; i < N; i++) {
            if (!stack.empty()) {
                if (stack.top().color == color[i] && stack.top().radius == radius[i]) {
                    stack.pop();
                }
                else {
                    stack.push(Pair(color[i], radius[i]));
                }
            }
            else {
                stack.push(Pair(color[i], radius[i]));
            }
        }
    
        return stack.size();
}
};