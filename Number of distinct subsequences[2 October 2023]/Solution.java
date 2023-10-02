//  >> JAVA CODE <<

class Solution {
    int mod=(int)1e9+7;
    
    int distinctSubsequences(String S) {
      int n = S.length();
      long [] dp = new long[n + 1];
      
      dp[0] = 1;
      HashMap<Character, Integer> lo = new HashMap<>();
      
      for(int i=1; i < dp.length; i++){
          dp[i] = (2 * dp[i-1]) % mod;
          char ch = S.charAt(i-1);
          
          if(lo.containsKey(ch)){
              int j =  lo.get(ch);
              dp[i] = (dp[i] - dp[j] + mod) % mod;
          }
          lo.put(ch, (i-1) % mod);
          
      }
      return (int)(dp[n] % mod);
      
      
  } 
}