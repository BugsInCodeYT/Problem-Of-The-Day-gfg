//  >> JAVA CODE 

public long[] smallerSum(int n,int arr[])
    {
        ArrayList<Long> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    cnt += arr[j];
                }
            }
            ans.add(cnt);
        }
        
            return ans.stream().mapToLong(i->i).toArray();
    }