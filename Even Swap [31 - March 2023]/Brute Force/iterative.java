//	>> JAVA CODE ITERATIVE <<

class Solution{

	int [] lexicographicallyLargest(int [] a, int n) {
		
	 boolean swapped = true;
    	 while (swapped) {
        swapped = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1] && (a[i] + a[i + 1]) % 2 == 0) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                swapped = true;
            }
        }
    	}	

    		return a;
	}
}