//  >> JAVA CODE <<

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        int n=arr.length;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++)
            {
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                
                int low=j+1,high=n-1;
                
                while(low<high){
                    if(arr[i]+arr[j]+arr[low]+arr[high]==k)
                    {
                        ArrayList<Integer> list=new ArrayList(Arrays.asList(arr[i],arr[j],arr[low],arr[high]));
                        ans.add(list);
                        
                        int a=arr[low],b=arr[high];
                        while(low<high && a==arr[low]) low++;
                        while(low<high &&  b==arr[high]) high--;
                        
                    }
                    else if(arr[i]+arr[j]+arr[low]+arr[high]<k) low++;
                    else high--;
                }
                
            }
        }
        
        return ans;
    }
}