//				>> JAVA CODE <<


class Solution 
{ 
    int findMedian(PriorityQueue<Integer> pq)
    {

        if(pq.size()==1) return pq.poll();
        ArrayList<Integer> list=new ArrayList<>();
            
        while(!pq.isEmpty())
        {
            list.add(pq.poll());
        }
        
        if(list.size()%2==0) return list.get(list.size()/2-1);
    
            return list.get(list.size()/2);
    }
    long countSubarray(int N, int A[], int M) 
    { 
        long ans=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                PriorityQueue<Integer> pq=new PriorityQueue<>();
                for(int k=i;k<=j;k++)
                {
                    pq.add(A[k]);
                }
                if(pq.size()==0) continue;
                
                int median=findMedian(pq);
                if(median==M) ans++;
            }
        }
        
            return ans;
    }
} 