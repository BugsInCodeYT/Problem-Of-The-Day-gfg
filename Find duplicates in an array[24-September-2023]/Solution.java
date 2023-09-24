//   >> JAVA CODE <<

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        int base=n;
        for(int i=0;i<n;i++)
        {
            int num=arr[i]%base;
            
            arr[num]=arr[num]+base;
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]/base>1) ans.add(i);
        }
        
        return ans.size()==0 ? new ArrayList(Arrays.asList(-1)) : ans;
    }
}