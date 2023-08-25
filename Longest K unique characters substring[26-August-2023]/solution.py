#  >> PYTHON CODE <<

class Solution:

    def longestKSubstr(self, s, k):
        st,end=0,0
        n=len(s)
        
        mp={}
        ans=-1
        while(end<n):
            mp[s[end]]=mp.get(s[end],0)+1
             
            total=len(mp)
             
            if(total>k):
                mp[s[st]]=mp.get(s[st],0)-1
                if(mp[s[st]]==0):
                    del mp[s[st]]
                st+=1
            elif total==k:
                #print(st, end, mp)
                ans=max(ans,end-st+1)
            end+=1

        return ans