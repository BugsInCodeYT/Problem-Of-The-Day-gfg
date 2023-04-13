//     >> JAVA CODE <<


class Solution {
    static class Pair{
        int color;
        int radius;
        
        Pair(int color,int radius)
        {
            this.color=color;
            this.radius=radius;
        }
    }
    public static int finLength(int N, int[] color, int[] radius) {
       
        Stack<Pair> stack=new Stack<>();
        
        for(int i=0;i<N;i++)
        {
            if(!stack.isEmpty())
            {
                if(stack.peek().color==color[i] && stack.peek().radius==radius[i])
                    stack.pop();
                else
                   stack.add(new Pair(color[i],radius[i]));
            }
            else
            {
                stack.add(new Pair(color[i],radius[i]));
            }
        }
        
        return stack.size();
    }
}