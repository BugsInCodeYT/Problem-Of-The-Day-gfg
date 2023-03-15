//			>> JAVA CODE <<

class Solution{
    static String secondSmallest(int S, int D){
        
        if(S>D*9 || D==1) return "-1";
        
        int orig=D;
        
        int[] smallest=new int[D];
        S-=1;
        for(int i=D-1;i>=0 && S>=0;i--)
        {
            if(S>=9)
            {
                smallest[i]+=9;
                S-=9;
            }
            else
            {
                smallest[i]+=S;
                break;
            }
        }
        
        smallest[0]+=1;
        
        int index=orig-1;
        
        for(int i=orig-1;i>=0;i--)
        {
            if(smallest[i]!=9) break;
            else
            {
                index=i;
            }
        }
        
        if(index==0) return "-1";
        
        smallest[index]-=1;
        smallest[index-1]+=1;
        
        StringBuffer ans=new StringBuffer("");
        
        for(int i:smallest)
        {
            ans.append(i);
        }
        
            return ans.toString();
    }
}