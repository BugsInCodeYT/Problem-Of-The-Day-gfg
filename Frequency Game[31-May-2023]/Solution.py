#  >> PYTHON CODE <<

def LargButMinFreq(arr,n):
    mp={}
    
    for element in arr:
        mp[element]=mp.get(element,0)+1

    ans=-1e9
    freq=1e9
    
    #print(mp)
    for key in mp:
        if(mp.get(key)<freq):
            ans=key
            freq=mp.get(key)
        elif mp.get(key)==freq:
            ans=max(key,ans)
    
    return ans