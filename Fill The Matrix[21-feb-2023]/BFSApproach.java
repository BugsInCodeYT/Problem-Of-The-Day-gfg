class Solution
{
	public static int minIteration(int N, int M, int x, int y){
	
	    Queue<int[]> q=new LinkedList<>();
    	boolean[][] visited=new boolean[N][M];
	           	
	    q.add(new int[]{x-1,y-1});
	    visited[x-1][y-1]=true;
	    
	    int itr=0;
	    while(!q.isEmpty())
	    {
	        int size=q.size();
	        
	        for(int i=0;i<size;i++)
	        {
	               int[] coor=q.poll();
	               int Xcor=coor[0],Ycor=coor[1];
	               
	               if(Xcor+1<N && !visited[Xcor+1][Ycor]) //downward direction
	               {
	                   visited[Xcor+1][Ycor]=true;
	                   q.add(new int[]{Xcor+1,Ycor});
	               }
	               if(Xcor-1>=0 && !visited[Xcor-1][Ycor]) //upward direction
	               {
	                   visited[Xcor-1][Ycor]=true;
	                   q.add(new int[]{Xcor-1,Ycor});
	               }
	               if(Ycor+1<M && !visited[Xcor][Ycor+1]) //right direction
	               {
	                   visited[Xcor][Ycor+1]=true;
	                   q.add(new int[]{Xcor,Ycor+1});
	               }
	               if(Ycor-1>=0 && !visited[Xcor][Ycor-1]) //left direction
	               {
	                   visited[Xcor][Ycor-1]=true;
	                   q.add(new int[]{Xcor,Ycor-1});
	               }
	        }
	        itr++;
	    }
	
	
	        return itr-1;
	}
}