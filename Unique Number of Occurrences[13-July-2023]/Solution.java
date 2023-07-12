//  >> JAVA CODE <<

class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        
        HashSet<Integer> st = new HashSet<>();
        
        for (int value : mp.values()) {
            if (st.contains(value)) {
                return false;
            }
            st.add(value);
        }
        
        return true;
    }
}
    