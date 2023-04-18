        #   >> PYTHON CODE <<
	  
        st=0
        while st<N and S[st]!='1':
            st+=1


        if(st==N or st>X):
            return False

        last=st
        for i in range(st,N):
            if((i-last+1)>2*(X+1)):
                #print("{} and {}".format(last,i))
                return False
            if(S[i]=='1'):
                last=i
        
        if(N-last>(X+1)):
            return False
            
        return True