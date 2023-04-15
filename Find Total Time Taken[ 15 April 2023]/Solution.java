//  >> JAVA CODE <<


public static long totalTime(int n,int arr[],int time[])
    {
        HashMap<Integer,Long> map=new HashMap<>();
        map.put(arr[0],0L);
        long ctime=0;
        
        for(int i=1;i<n;i++)
        {
            long lastEncountered=map.containsKey(arr[i])?map.get(arr[i]):-1;
            
            if(lastEncountered==-1)
            {
                ctime+=1;
            }
            else
            {
                if((ctime-lastEncountered)>=time[arr[i]-1]) ctime++;
                else ctime+=(time[arr[i]-1]-(ctime-lastEncountered));
            }
            
            map.put(arr[i],ctime);
        }
        
            return ctime;
    }