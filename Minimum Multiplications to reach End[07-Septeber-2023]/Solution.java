//  >> JAVA CODE <<

class Solution {
    
    int minimumMultiplications(int[] arr, int start, int end) {

        int level=0;

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited=new boolean[100001];
        
        queue.offer(start);
        visited[start]=true;
        while (!queue.isEmpty()) {
            
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                
                int current = queue.poll();
                
                if (current == end) {
                    return level;
                }
            
                for (int number : arr) {
                        int newStart = (current * number) % 100000;
                        if(visited[newStart]!=true){
                            queue.offer(newStart);
                            visited[newStart]=true;
                        }
                }
            }
            
            level++;    
        }

        return -1;
        
    }
}