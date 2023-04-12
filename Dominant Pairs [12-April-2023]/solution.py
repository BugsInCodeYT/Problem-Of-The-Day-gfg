#    >> Python CODE <<

class Solution:
    def dominantPairs(self, n : int, arr : List[int]) -> int:
        n = len(arr)
        arr_first_half = arr[:n//2]
        arr_second_half = arr[n//2:]
        arr_first_half.sort()
        arr_second_half.sort()
        i = 0
        j = 0
        ans = 0

        while i < n // 2 and j < n//2:
            if arr_first_half[i] >= 5 * arr_second_half[j]:
                ans += (n // 2 - i)
                j += 1
            else:
                i += 1
        
        return ans