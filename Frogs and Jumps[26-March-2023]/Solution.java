//		>> JAVA CODE << 

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        
        boolean[] visited=new boolean[leaves+1];
        
        for(int frog:frogs)
        {
            if(frog<=leaves && visited[frog]) continue;
            
            for(int i=frog;i<=leaves;i+=frog)
            {
               visited[i]=true;
            }
        }
        
        int cnt=0;
        
        for(int i=1;i<leaves+1;i++)
        {
            if(visited[i]==false) cnt++;
        }
        
        return cnt;
    }
}