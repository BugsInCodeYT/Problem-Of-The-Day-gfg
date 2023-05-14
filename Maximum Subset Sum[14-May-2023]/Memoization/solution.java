//  >> JAVA MEMO <<

public static long solve(int i,int prevTaken,int[] arr,Long[][] dp)
    {

        if(i>=arr.length) return 0;
        
        if(dp[i][prevTaken]!=null)
            return dp[i][prevTaken];
        
        if(prevTaken==0)
        {
            return dp[i][prevTaken]=solve(i+1,1,arr,dp)+arr[i];
        }
        else
        {
            return dp[i][prevTaken]=Math.max(solve(i+1,1,arr,dp)+arr[i],solve(i+1,0,arr,dp));
        }

    }
    public static long findMaxSubsetSum(int N, int[] A) {
        
        Long[][] dp=new Long[N][2];
        
        return Math.max(solve(0,0,A,dp),solve(0,1,A,dp));
        
    }