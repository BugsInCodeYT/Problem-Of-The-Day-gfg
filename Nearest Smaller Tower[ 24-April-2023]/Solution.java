//  >> JAVA CODE <<


int [] nearestSmallestTower(int [] arr){	  
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        
        // fill left array
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            } else {
                left[i] = -1;
            }
            stack.push(i);
        }
        
        // clear the stack and fill right array
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            } else {
                right[i] = n;
            }
            stack.push(i);
        }
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (left[i] == -1 && right[i] == n) {
                ans[i] = -1;
            } else if (left[i] == -1) {
                ans[i] = right[i];
            } else if (right[i] == n) {
                ans[i] = left[i];
            } else if (i - left[i] == right[i] - i) {
                if (arr[left[i]] < arr[right[i]]) {
                    ans[i] = left[i];
                } else if (arr[left[i]] == arr[right[i]]) {
                    ans[i] = Math.min(left[i], right[i]);
                } else {
                    ans[i] = right[i];
                }
            } else {
                if (i - left[i] < right[i] - i) {
                    ans[i] = left[i];
                } else {
                    ans[i] = right[i];
                }
            }
        }
        return ans;
    }