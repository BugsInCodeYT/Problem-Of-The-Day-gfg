class Solution
{
	public static int minIteration(int N, int M, int x, int y){
		
		int d1=x-1+y-1;
		int d2=N-x+y-1;
		int d3=N-x+M-y;
		int d4=M-y+x-1;
		
		
		    return Arrays.stream(new int[]{d1,d2,d3,d4}).max().getAsInt();
		
	}
}
