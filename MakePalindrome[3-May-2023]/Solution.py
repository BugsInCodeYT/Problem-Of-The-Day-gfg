def makePalindrome(self,n, arr):
        map = defaultdict(int)
        
        for i in range(n):
            str = arr[i]
            map[str] = map.get(str, 0) + 1
        
        for i in range(n):
            str = arr[i]
            rev = str[::-1]
        
            if map[str] != map[rev]:
                    return False
        
        return True
