//  >> JAVA CODE <<

class Solution{
    static String findLargest(int N, int S){
        
        if(S>N*9 || (S==0 && N>1)) return "-1";
        
        StringBuilder sb=new StringBuilder("");
        
        while(S>=9)
        {
            sb.append("9");
            N-=1;
            S-=9;
        }
        
        while(N>0)
        {
            if(S!=0)
            {
                sb.append(String.valueOf(S));
                S=0;
            }
            else
                sb.append("0");
                
            N-=1;
        }
        
        return sb.toString();
        
    }
}