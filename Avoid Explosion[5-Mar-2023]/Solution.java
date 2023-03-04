Problems
Courses
Job Fair
Contests
POTD





























































Refresh

Time (IST)	Status	Lang	Test Cases	Code
2023-03-05 01:14:04	Time Limit Exceeded	java	16 / 210	View
2023-03-05 01:00:25	Correct	java	220 / 210	View
2023-03-05 00:59:34	Correct	java	220 / 210	View
2023-03-05 00:22:22	Wrong	java	2 / 210	View
Java (1.8)



            


 

Custom Input


// User function Template for Java

class Solution {
    public int findPar(int[] parent,int val)
    {
        if(parent[val]==val) return val;
        
            return parent[val]=findPar(parent,parent[val]);
    }
    public void union(int x,int y,int[] parent,int[] rank)
    {
        if(rank[x]>rank[y])
        {
            parent[y]=x;
            rank[x]++;
        }
        else if(rank[y]>rank[x])
        {
            parent[x]=y;
            rank[y]++;
        }
        else
        {
            parent[y]=x;
            rank[x]++;
        }
    }
    ArrayList<String> avoidExlosion(int mix[][], int n, int danger[][], int m) {
        
        int[] parent=new int[n+1];
        int[] rank=new int[n+1];
        
        for(int i=0;i<=n;i++){
            parent[i]=i;
            rank[i]=0;
        }
        
        ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            int x=mix[i][0],y=mix[i][1];
            int px=findPar(parent,x),py=findPar(parent,y);
            
            boolean safe=true;
            
            for(int[] dd:danger)
            {
                int u=dd[0],v=dd[1];
                int pu=findPar(parent,u),pv=findPar(parent,v);
                
                if((pu==px && py==pv) || (pv==px && pu==py)) 
                {
                    safe=false;
                    break;
                }
            }
            
            ans.add(safe?"Yes":"No");
            if(safe) union(px,py,parent,rank);
        }
        
            return ans;
    }
}