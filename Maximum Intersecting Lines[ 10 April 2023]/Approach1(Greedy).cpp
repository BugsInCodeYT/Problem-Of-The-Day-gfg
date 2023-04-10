//    >> C++ CODE <<

class Solution {
  public:
    int maxIntersections(vector<vector<int>> lines, int N) {
        
        int slines[N];
        int elines[N];
        
        for(int i=0;i<N;i++)
        {
            slines[i] = lines[i][0];
            elines[i] = lines[i][1];
        }
        
        sort(slines, slines + N);
        sort(elines, elines + N);
        
        int i=0;
        int j=0;
        int intersections=0;
        int finalAns=INT_MIN;
        
        while(i<N && j<N)
        {
            if(slines[i] <= elines[j])
            {
                intersections++;
                finalAns = max(finalAns, intersections);
                i++;
            }
            else
            {
                intersections--;
                j++;
            }
        }
        
        
        return finalAns;
    }
};