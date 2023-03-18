// 				>> JAVA CODE <<

class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(var in:A) map.put(in,map.getOrDefault(in,0)+1);
        
        for(int i=0;i<A.length;i++)
        {
            map.put(A[i],map.get(A[i])-1);
            if(map.get(A[i])==0) map.remove(A[i]);
            
            int left=set.size();
            int right=map.size();
            
            ans.add(left-right);
            
            set.add(A[i]);
        }
        
        
            return ans;
    }
}
        
