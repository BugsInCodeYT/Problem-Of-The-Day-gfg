//			>> JAVA CODE <<

class Solution{
	long no_of_subarrays(int N, int [] arr) {
		
		long ans=0;
		long cnt=0;

		
		//just count the continuous number of 0's
		for(var in:arr)
		{
		    if(in==0)
		    {
		        cnt++;
		    }
		    else
		    {
				// number of subarrays = n*(n+1)/2;
		        ans+=((long)(cnt*(cnt+1))/2);
		        cnt=0;
		    }
		}
		if(cnt!=0)
		{
		    ans+=((long)(cnt*(cnt+1))/2);
		}
		
		    return ans;
	}
}