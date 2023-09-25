//   >> JAVA CODE <<

class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        List<Integer> ans=new ArrayList<>();
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            
            return b[0]-a[0];
        });
        
        
        for(int i=0;i<N;i++)
        {
          pq.add(new int[]{A[i]+B[N-1],N-1});  
        }
        
        while(!pq.isEmpty() && K-->0)
        {
            int sum=pq.peek()[0];
            int ind=pq.peek()[1];
            pq.poll();
            
            ans.add(sum);
            
            if(ind-1>=0)
                pq.add(new int[]{sum- B[ind]+B[ind-1],ind-1});
        }
        
        return ans;
    }
}