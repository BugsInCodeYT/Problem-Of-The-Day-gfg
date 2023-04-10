//	>> JAVA CODE <<

public int maxIntersections(int[][] lines, int N) {
       
       TreeMap<Integer, Integer> map = new TreeMap<>();
       
        for(int[] line : lines){
            int start = line[0], end = line[1] + 1;
            map.putIfAbsent(start, 0);
            map.putIfAbsent(end, 0);
            
            map.put(start, map.get(start) + 1);
            map.put(end, map.get(end) - 1);
        }
        
        int res = 0, cnt = 0;
        for(Integer value:map.values()){
            cnt += value;
            res = Math.max(res, cnt);
        }
        
        return res;
       
    }