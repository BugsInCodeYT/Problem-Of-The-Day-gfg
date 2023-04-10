#  >> PYTHON CODE <<

def maxIntersections(self, lines, N):
        lineMap = dict()
        for line in lines:
            start = line[0]
            end = line[1] + 1
        
            if start in lineMap:
                lineMap[start]+=1
            else: 
                lineMap[start]=1
            if end in lineMap:
                lineMap[end]-=1
            else:
                lineMap[end]=-1
        
        res = 0
        cnt = 0
        for entry in sorted(lineMap.keys()):
            cnt += lineMap[entry]
            res = max(res, cnt)
        
        return res