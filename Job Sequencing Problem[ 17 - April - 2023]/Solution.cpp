//   >> C++ CODE <<


    static bool comparison(Job a, Job b) 
    { 
    	return (a.profit > b.profit); 
    } 
    
    vector<int> JobScheduling(Job arr[], int n) 
    { 
        int res = 0, count = 0;
        
    	sort(arr, arr+n, comparison); 
    
    	bool jobsDone[n]; 
    
    	for (int i=0; i<n; i++) 
    		jobsDone[i] = false; 
    
    	for (int i=0; i<n; i++) 
    	{  
        	for (int j= min(arr[i].dead-1,n-1); j>=0; j--) 
        	{ 
        		if (jobsDone[j]==false) 
        		{ 
        		    res+=arr[i].profit;
        		    count+=1;
        			jobsDone[j] = true; 
        			break; 
        		} 
        	} 
    	} 
    
    	
    	return {count,res};
    } 