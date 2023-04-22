#   >> PYTHON CODE <<

def minimumNumber(self, n, arr):
        def greatest_common_divisor(a,b):
            if(b==0): return a
            
            return greatest_common_divisor(b,a%b)
        
        gcd=0
        
        for val in arr:
            gcd=greatest_common_divisor(gcd,val)
        
        return gcd
