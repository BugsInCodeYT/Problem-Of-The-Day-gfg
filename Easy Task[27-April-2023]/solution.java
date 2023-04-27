//  >> JAVA CODE <<

class Solution {
    static int seg[][];
    public static ArrayList<Character> easyTask(int n,String s,int q,query queries[])
    {
        seg=new int[4*n][26];
        char c[]=s.toCharArray();
        buildTree(c,0,0,n-1);
        ArrayList<Character> ans=new ArrayList<>();
        for(int i=0;i<q;i++){
            if(queries[i].type.equals("1")){
                int ind=Integer.parseInt(queries[i].a);
                char val=queries[i].b.charAt(0);
                update(0,0,n-1,ind,val);
            }else{
                int l=Integer.parseInt(queries[i].a);
                int r=Integer.parseInt(queries[i].b);
                int k=Integer.parseInt(queries[i].c);
                int arr[]=query(0,0,n-1,l,r);
                for(int j=25;j>=0;j--){
                    if(arr[j]!=0){
                        if(arr[j]>=k)
                        {
                            ans.add((char)(j+'a'));
                            break;
                        }
                        else
                        {
                            k-=arr[j];
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void buildTree(char a[],int si,int ss,int se)
	{
		if(ss==se){
			seg[si][a[ss]-'a']++;
			return;
		}
		int mid=(ss+se)/2;
		buildTree(a,2*si+1,ss,mid);
		buildTree(a,2*si+2,mid+1,se);
        int a1[]=seg[2*si+1];
        int a2[]=seg[2*si+2];
        for(int i=0;i<26;i++){
            seg[si][i]=a1[i]+a2[i];
        }
	}
    public static void update(int si,int ss,int se,int pos,char val)
	{
		if(ss==se){
            int in=0;
            for(int i=0;i<26;i++){
                if(seg[si][i]>=1){
                    in=i;
                    break;
                }
            }
            seg[si][in]--;
			seg[si][val-'a']++;
			return;
		}
		int mid=(ss+se)/2;
		if(pos<=mid){
			update(2*si+1,ss,mid,pos,val);
		}else{
			update(2*si+2,mid+1,se,pos,val);
		}
		int a1[]=seg[2*si+1];
        int a2[]=seg[2*si+2];
        for(int i=0;i<26;i++){
            seg[si][i]=a1[i]+a2[i];
        }
	}
    public static int[] query(int si,int ss,int se,int qs,int qe)
	{
		if(qs>se || qe<ss)return new int[26];
		if(ss>=qs && se<=qe)return seg[si];
		int mid=(ss+se)/2;
		int a1[]=query(2*si+1,ss,mid,qs,qe);
		int a2[]=query(2*si+2,mid+1,se,qs,qe);

        int ans[]=new int[26];
        for(int i=0;i<26;i++){
            ans[i]=a1[i]+a2[i];
        }
        return ans;
	}
}

class query
{
    String type;
    String a;
    String b;
    String c;
    public query(String type,String a,String b,String c)
    {
        this.type=type;
        this.a=a;
        this.b=b;
        this.c=c;
    }
}