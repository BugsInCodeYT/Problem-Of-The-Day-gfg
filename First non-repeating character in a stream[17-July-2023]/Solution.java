//  >> JAVA CODE <<

class Solution
{
    public String FirstNonRepeating(String A)
    {
        int n = A.length();
        int[] f = new int[26];
        int[] first = new int[26];
        Arrays.fill(first, -1);

        for (int i = 0; i < n; i++) {
            if (first[A.charAt(i) - 'a'] == -1) {
                first[A.charAt(i) - 'a'] = i;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            f[A.charAt(i) - 'a'] += 1;
            char ch = '#';
            int x = n + 1;
            for (int j = 0; j < 26; j++) {
                if (f[j] == 1 && x > first[j]) {
                    ch = (char) (j + 'a');
                    x = first[j];
                }
            }
            
            ans.append(ch);
        }

        return ans.toString();
    }
}