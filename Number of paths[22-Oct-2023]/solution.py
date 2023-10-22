#   >> PYTHON CODE <<

class Solution:
    def numberOfPaths(self, M, N):
        mod = int(1e9 + 7)
        
        n = M + N - 2
        r = M - 1
        ans = 1

        # Calculate (n choose r) % mod
        for i in range(1, r + 1):
            ans = (ans * (n - i + 1)) % mod
            ans = (ans * pow(i, mod - 2, mod)) % mod  # Calculate the modular inverse and use it for division

        return int(ans)