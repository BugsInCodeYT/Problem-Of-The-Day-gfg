//  >> JAVA CODE <<

public static String stringMirror(String s) {
        String k = "" + s.charAt(0);
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(0) == s.charAt(1)) {
                break;
            }
            if (s.charAt(i) <= s.charAt(i-1)) {
                k += s.charAt(i);
            } else {
                break;
            }
        }
        k += new StringBuilder(k).reverse().toString();
        return k;
    }