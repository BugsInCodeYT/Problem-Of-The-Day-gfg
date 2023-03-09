class Solution {
    Long maxTripletProduct(Long arr[], int n)
    {
        long largest=Integer.MIN_VALUE,slargest=Integer.MIN_VALUE,tlargest=Integer.MIN_VALUE;
        long smallest=Integer.MAX_VALUE,ssmallest=Integer.MAX_VALUE;
        
        for(long el:arr)
        {
                if(el>largest)
                {
                    tlargest=slargest;
                    slargest=largest;
                    largest=el;
                }
                else if(el>slargest)
                {
                    tlargest=slargest;
                    slargest=el;
                }
                else if(el>tlargest)
                {
                    tlargest=el;
                }

            
            if(el<smallest)
            {
                ssmallest=smallest;
                smallest=el;
            }
            else if(el<ssmallest)
            {
                ssmallest=el;
            }
            
        }
        

                return Math.max(smallest*ssmallest*largest,largest*slargest*tlargest);
                
    }
}