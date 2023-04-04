//    >> JAVA CODE <<

int minSteps(String str) {

    int n = str.length();
    if (n == 0 || n == 1) {
        return n;
    }
    
    
    int minSteps = Integer.MAX_VALUE/2;
    for (int i = 0; i < n;) {
        
        int j=i+1;
        
        while(j<n && str.charAt(j)==str.charAt(i))
        {
            j++;
        }
        
        String newString=str.substring(0,i)+str.substring(j,str.length());
        //System.out.println(newString);
        minSteps=Math.min(minSteps,1+minSteps(newString));
        
        i=j;
    }
    return minSteps;
}