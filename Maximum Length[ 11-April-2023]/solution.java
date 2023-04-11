// >> JAVA CODE <<

int max=Math.max(a,Math.max(b,c));
        
        int y;
        
        if(max==a) y=b+c;
        else if(max==b) y=c+a;
        else y=a+b;
        
        
        if(2*(y+1)>=max) return a+b+c;
        
            return -1;