# >> PYTHON CODE <<

class Solution: 
    def maxIntersections(self, lines, N):
        slines=[]
        elines=[]
        
        for point in lines:
            slines.append(point[0])
            elines.append(point[1])
        
        slines.sort()
        elines.sort()
        
        i=0
        j=0
        
        ans=-1e9
        intersections=0
        
        while(i<N and j<N):
            if(slines[i]<=elines[j]):
                intersections+=1
                ans=max(ans,intersections)
                i+=1
            else:
                intersections-=1
                j+=1
        
        return ans