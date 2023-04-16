int[] JobScheduling(Job arr[], int n)
    {
        boolean[] jobsDone = new boolean[n];
        Arrays.fill(jobsDone, false);
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        int cnt = 0, profit = 0;
        for (Job job : arr) {
            for (int i = Math.min(job.deadline - 1, n - 1); i >= 0; i--) {
                if (!jobsDone[i]) {
                    cnt++;
                    profit += job.profit;
                    jobsDone[i] = true;
                    break;
                }
            }
        }
        return new int[]{cnt, profit};
    }