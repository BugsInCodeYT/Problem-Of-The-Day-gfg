

class Solution {
     public static long bestNode(int N, int[] A, int[] P) {
        HashSet<Integer> set = new HashSet<>();
        for(int k: P)
            set.add(k);
        ArrayList<Integer> leafNode = new ArrayList<>();
        for(int i = 1; i <= P.length; i++){
            if(!set.contains(i))
                leafNode.add(i);
        }
        int answer = Integer.MIN_VALUE;
        for(int leaf: leafNode){
            int node = leaf;
            int ans = 0;
            while(node != -1){
                ans*=-1;
                ans += (A[node-1]);
                answer = Math.max(answer, ans);
                node = P[node-1];
            }
        }
        return answer;
    }
}
        