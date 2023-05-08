//  >> JAVA CODE <<

int modulo(String s, int m) {
		int n=s.length();
		
		int[] power=new int[n];
		
		power[n-1]=1;
		
		for(int i=n-2;i>=0;i--)
		{
		   power[i]=(power[i+1]%m*2%m)%m;
		}
		
		int ans=0;
		for(int i=0;i<n;i++)
		{
		    if(s.charAt(i)=='1')
		    {
		        ans=(ans%m+power[i]%m)%m;
		    }
		}
		
		    return ans;
	}