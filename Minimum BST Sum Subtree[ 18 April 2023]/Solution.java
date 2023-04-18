//  >> JAVA CODE <<


class Solution {
    static int ans;
    static class Data{
        int min,max,sum,count;
        boolean isBST;
        
        Data(boolean isBST,int min,int max,int sum,int count)
        {
            this.isBST=isBST;
            this.min=min;
            this.max=max;
            this.sum=sum;
            this.count=count;
        }
    }
    static Data solve(Node root,int target)
    {
        if(root==null)
        {
            return new Data(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0,0);
        }
        
        Data left=solve(root.left,target);
        Data right=solve(root.right,target);
        
        int totalSum=left.sum+right.sum+root.data;
        int totalCount=left.count+right.count+1;
        int newMin=Math.min(root.data,Math.min(left.min,right.min));
        int newMax=Math.max(root.data,Math.max(left.max,right.max));
        
        boolean isBST= left.isBST && right.isBST && root.data>left.max && root.data<right.min;
        
        if(isBST && totalSum==target) ans=Math.min(ans,totalCount);
        
        return new Data(isBST,newMin,newMax,totalSum,totalCount);
    }
    public static int minSubtreeSumBST(int target, Node root) {
        
        ans=Integer.MAX_VALUE;
        
        solve(root,target);
        
        if(ans==Integer.MAX_VALUE) return -1;
        
        return ans;
    }
}