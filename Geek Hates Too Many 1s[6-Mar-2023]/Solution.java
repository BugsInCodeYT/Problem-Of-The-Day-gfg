
class Solution {
    public static int noConseBits(int n) {
        
        int[] bits=new int[32];
        
        for(int i=0;i<32;i++)
        {
            int bit=((1<<i)&n)>0?1:0;
            bits[31-i]=bit;
        }
        
        int i=0,j=0;
        int sum=0;
        while(j<32)
        {
            if(j<2)
            {
                sum+=bits[j];
                j++;
            }
            else
            {
                
                sum+=bits[j];
                
                if(sum==3)
                {
                    sum-=bits[j];
                    bits[j]=0; 
                }
                
                sum=sum-bits[i];
                j++;
                i++;
            }
        }
        
        
        int num=0;
        
        for(i=31;i>=0;i--)
        {
            num+=Math.pow(2,(31-i))*bits[i];
        }
        
            return num;
    }
}