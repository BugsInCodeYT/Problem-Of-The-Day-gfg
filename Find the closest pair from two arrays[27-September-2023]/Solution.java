//  >> JAVA CODE <<

class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        
        int val1=-1,val2=-1;
        int i=0,j=m-1;
        int diff=Integer.MAX_VALUE;
        
        while(i<n && j>=0)
        {
            int sum=arr[i]+brr[j];
            
            if(Math.abs(sum-x)<diff){
                diff=Math.abs(sum-x);
                val1=arr[i];
                val2=brr[j];
            }
            
            if(sum<=x) i++;
            else j--;
        }
        
        return new ArrayList(Arrays.asList(val1,val2));
        
        
    }
}