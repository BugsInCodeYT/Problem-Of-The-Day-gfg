//    >> JAVA CODE <<


    public static long solve(int N, int[] A, int[] B) {
        
       List<Integer> oddA = new ArrayList<>();
       List<Integer> oddB = new ArrayList<>();
       List<Integer> evenA = new ArrayList<>();
       List<Integer> evenB = new ArrayList<>();
        
        
        long sum1=0,sum2=0;
        
        for(int i=0;i<N;i++)
        {
            sum1+=A[i];
            sum2+=B[i];
            
            if(A[i]%2==0) evenA.add(A[i]);
            else oddA.add(A[i]);
            
            if(B[i]%2==0) evenB.add(B[i]);
            else  oddB.add(B[i]);
        }
        
        
        if(sum1!=sum2 || (oddA.size()!=oddB.size())) return -1;
        
        long ans=0;
        
        Collections.sort(oddA); Collections.sort(oddB);
        Collections.sort(evenA); Collections.sort(evenB);
        
        for(int i=0;i<oddA.size();i++)
             ans += (Math.abs(oddA.get(i)-oddB.get(i)))/2;
        
        for(int i=0;i<evenA.size();i++)
            ans += Math.abs(evenA.get(i)-evenB.get(i))/2;
        
            return ans/2;
    }