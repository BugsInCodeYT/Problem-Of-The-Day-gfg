//  >> JAVA CODE <<

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i+m-1<n;i++)
        {
            ans=Math.min(ans,a.get(i+m-1)-a.get(i));
        }
        
        return ans;
        
    }
}