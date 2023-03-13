

//User function Template for Java

class Solution{
    int solve(int i,ArrayList<Integer> arr,int N)
    {
        if(i>N) return 0;
        
        int max=Integer.MIN_VALUE;
        
        for(int b=i;b<=N;b++)
        {
            int cost=arr.get(b)*arr.get(i-1)*arr.get(N+1)+solve(b+1,arr,N)+solve(i,arr,b-1);
            max=Math.max(max,cost);
        }
        
            return max;
    }
    int maxCoins(int N, ArrayList<Integer> arr) {
		
		arr.add(0,1); arr.add(1);
		
		    return solve(1,arr,N);
		
	}
}