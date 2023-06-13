// >> Java Code <<

class Solution {
    public int[] kLargest(int[] arr, int n, int k) {
        buildHeap(arr, n);
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i]=arr[0];
            arr[0] =-1;
            heapify(arr, 0, n);
        }

        return ans;
    }

    private void heapify(int[] arr, int i, int n) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, n);
        }
    }

    private void buildHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

}