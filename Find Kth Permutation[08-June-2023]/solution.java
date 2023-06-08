//  >> JAVA CODE <<

public static String kthPermutation(int n,int k) {
       List<Integer>al=new ArrayList<>();
       int f=1;
       for(int i=1;i<n;i++){
           f*=i;
           al.add(i);
       }
       al.add(n);
       
       String ans="";
       k=k-1;
       while(al.size()>0){
           int idx=al.get(k/f);
           al.remove(k/f);
           ans+=idx;
           if(al.size()==0)break;
           k=k%f;
           f=f/al.size();
       }
       return ans;
    }