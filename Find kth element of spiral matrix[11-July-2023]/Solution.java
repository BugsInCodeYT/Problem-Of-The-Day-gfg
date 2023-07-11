//  >> JAVA CODE <<

class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	    int rowSt=0,colSt=0,rowEnd=n-1,colEnd=m-1;
	    
	    
	    while(rowSt<=rowEnd && colSt<=colEnd)
	    {
	        for(int i=colSt;i<=colEnd;i++)
	        {
	            k-=1;
	            if(k==0) return A[rowSt][i];
	        }
	        
	        rowSt+=1;
	        
	        for(int i=rowSt;i<=rowEnd;i++)
	        {
	            k-=1;
	            if(k==0)  return A[i][colEnd];
	        }
	        
	        colEnd-=1;
	        
	        for(int i=colEnd;i>=colSt;i--)
	        {
	            k-=1;
	            if(k==0) return A[rowEnd][i];
	        }
	        
	        rowEnd-=1;
	        
	        for(int i=rowEnd;i>=rowSt;i--)
	        {
	            k-=1;
	            if(k==0) return A[i][colSt];
	        }
	        
	        colSt+=1;
	    }
	    
	    return -1;
    }
}