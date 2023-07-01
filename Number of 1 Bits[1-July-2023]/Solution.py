#  >> PYTHON CODE <<

def setBits(self, N):
		setBits=0
		while(N>0):
		    N=N&(N-1)
		    setBits+=1

        return setBits