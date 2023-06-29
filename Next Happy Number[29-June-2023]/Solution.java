//   >> JAVA CODE <<

class Solution{

    static int nextHappy(int N) {
        int nextNumber = N + 1;
        
        while (true) {
            if (isHappy(nextNumber)) {
                return nextNumber;
            }
            
            nextNumber++;
        }
    }
    
    private static boolean isHappy(int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        while (!mp.containsKey(n)) {
            mp.put(n, 1);
            int sum = 0;
            
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            
            if (sum == 1) {
                return true;
            }
            
            n = sum;
        }
        
        return false;
    }
}