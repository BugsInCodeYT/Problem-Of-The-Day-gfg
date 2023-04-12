def findUsingBinarySearch(self, arr: List[int], low: int, high: int, el: int) -> int:
        ans = high + 1
        while low <= high:
            mid = (low + high) // 2
            if arr[mid] >= 5 * el:
                ans = mid
                high = mid - 1
            else:
                low = mid + 1
        return ans
    
    def dominantPairs(self, n: int, arr: List[int]) -> int:
        arr[:n//2] = sorted(arr[:n//2])
        ans = 0
        for j in range(n//2, n):
            i = self.findUsingBinarySearch(arr, 0, n//2 - 1, arr[j])
            ans += (n//2 - i)
        return ans