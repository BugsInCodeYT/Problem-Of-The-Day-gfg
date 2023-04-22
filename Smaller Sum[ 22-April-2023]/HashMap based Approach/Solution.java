//   >> JAVA CODE <<


public long[] smallerSum(int n,int arr[])
    {
        HashMap<Integer,Long> map=new HashMap<>();
        long[] ans=new long[n]; int in=0;
        int[] arrcpy=new int[n];
        
        for(int i=0;i<n;i++) arrcpy[i]=arr[i]; 
        
        
        Arrays.sort(arrcpy);
        
        long prefixSum=arrcpy[0];
        map.put(arrcpy[0],(long)0);
        
        for(int i=1;i<n;i++)
        {
            if(arrcpy[i-1]==arrcpy[i])
            {
                long sum=map.get(arrcpy[i-1]);
                map.put(arrcpy[i],sum);
            }
            else
            {
                map.put(arrcpy[i],prefixSum);
            }
            
            prefixSum+=arrcpy[i];
        }
        
        
        for(int i=0;i<n;i++)
        {
            ans[i]=map.get(arr[i]);
        }
        
            return ans;
    }