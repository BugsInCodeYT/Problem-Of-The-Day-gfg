//    >> JAVA CODE <<


HashMap<Integer,Boolean> map=new HashMap<>();
        
        boolean[] res=new boolean[N];
        
        for(int i=0;i<N;i++)
        {
            if(map.containsKey(arr[i])){ 
                res[i]=map.get(arr[i]);
                continue;
            }
            
            for(int j=0;j<N;j++)
            {
                if(i!=j && arr[i]%arr[j]==0){
                    res[i]=true;
                    break;
                }
            }
            
            map.put(arr[i],res[i]);
            
        }
    
    
        int ans=0;
        
        for(int i=0;i<N;i++)
        {
            if(res[i]) ans++;
        }
        
                return ans;