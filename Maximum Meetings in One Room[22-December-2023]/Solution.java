//        >> JAVA CODE <<



class Solution {
    static class Pair{
        int st,end,index;
        Pair(int st,int end,int index)
        {
            this.st=st;
            this.end=end;
            this.index=index;
        }
    }
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        
        ArrayList<Pair> meetings=new ArrayList<>();
        
        for(int i=0;i<N;i++)
        {
            meetings.add(new Pair(S[i],F[i],i+1));
        }
        
        Collections.sort(meetings,(a,b)->Integer.compare(a.end,b.end));
        
        ArrayList<Integer> ans=new ArrayList<>();
        Pair prev=null;
        for(int i=0;i<N;i++)
        {
            if(i==0)
            {
                ans.add(meetings.get(i).index);
                prev=meetings.get(i);
            }
            else
            {
                if(meetings.get(i).st>prev.end)
                {
                    ans.add(meetings.get(i).index);
                    prev=meetings.get(i);
                }
            }
        }
        
        Collections.sort(ans);
        
            return ans;
        
    }
}
        