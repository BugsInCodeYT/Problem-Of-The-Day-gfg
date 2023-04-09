mod = int(1e9) + 7
def check(num, C, D):
    while num > 0:
        val = num % 10
        if val == C or val == D:
            return True
        num //= 10
    return False

def binPower(a, n):
    res = 1
    while n > 0:
        if n % 2 != 0:
            res = (res * a) % mod
        a = (a * a) % mod
        n //= 2
    return res
    
class Solution:
    def bestNumbers(self, N : int, A : int, B : int, C : int, D : int) -> int:

        if A == B:
            if check(N * A, C, D):
                return 1
            return 0
        
        fact = [0] * (N + 1)
        fact[0] = 1
        for i in range(1, N + 1):
            fact[i] = (fact[i - 1] * i) % mod
        ans = 0
        for i in range(N + 1):
            sum = i * A + (N - i) * B
            if check(sum, C, D):
                ans += fact[N] * binPower((fact[i] * fact[N - i]) % mod, mod - 2)
                ans %= mod
                
        return int(ans)
