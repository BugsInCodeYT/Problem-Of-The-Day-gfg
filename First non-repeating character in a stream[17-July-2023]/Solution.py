#   >> PYTHON CODE <<

class Solution:
    def FirstNonRepeating(self, A):
        n = len(A)
        f = [0] * 26
        first = [-1] * 26
        
        for i in range(n):
            if first[ord(A[i]) - ord('a')] == -1:
                first[ord(A[i]) - ord('a')] = i
        
        ans = ""
        for i in range(n):
            f[ord(A[i]) - ord('a')] += 1
            ch = '#'
            x = n + 1
            for j in range(26):
                if f[j] == 1 and x > first[j]:
                    ch = chr(j + ord('a'))
                    x = first[j]
            
            ans += ch
        
        return ans