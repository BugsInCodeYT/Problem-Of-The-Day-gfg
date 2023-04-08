//    >> JAVA CODE <<

public static ArrayList<Integer> makeBeautiful(int[] arr) {
        
        Stack<Integer> st=new Stack<>();
        
        int i=0;
        while(i<arr.length)
        {
            if(!st.isEmpty() && ((arr[i]<0 && st.peek()>=0) || (arr[i]>=0 && st.peek()<0)))
            {
                st.pop();
            }
            else
            {
                st.add(arr[i]);
            }
            
            i++;
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        while(!st.isEmpty())
        {
            ans.add(0,st.pop());
        }
        
            return ans;
    }