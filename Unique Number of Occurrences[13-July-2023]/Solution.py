#   >> PYTHON CODE <<

class Solution:
    def isFrequencyUnique(self, n : int, arr : List[int]) -> bool:
        mp={}
        
        for i in range(n):
            mp[arr[i]]=mp.get(arr[i],0)+1
        
        st=set()
        
        
        for key in mp.values():
            if(key in st): return False
            st.add(key)
        
        return True
        
