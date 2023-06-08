#  >> PYTHON CODE <<

class Solution:
    def kthPermutation(self, n : int, k : int) -> str:
        al = []
        f = 1
        for i in range(1, n):
            f *= i
            al.append(i)
        al.append(n)
        ans = ""
        k = k - 1
        while len(al) > 0:
            idx = al[k // f]
            al.pop(k // f)
            ans += str(idx)
            if len(al) == 0:
                break
            k = k % f
            f = f // len(al)
        
        return ans