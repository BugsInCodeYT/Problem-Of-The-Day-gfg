	#   >> PYTHON CODE <<

    def solve(self, a, b, c):
        maximum=max(a,b,c)
        
        if maximum==a:
            y=b+c
        elif maximum==b:
            y=a+c
        else:
            y=b+a;
        
        if(2*(y+1)<maximum):
            return -1
        
        return a+b+c