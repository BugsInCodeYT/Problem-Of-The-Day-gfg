#  >> PYTHON CODE <<


def totalTime(self,n: int, arr: List[int], time: List[int]) -> int:
        map = {arr[0]: 0}
        ctime = 0
        
        for i in range(1, n):
            lastEncountered = map.get(arr[i], -1)
            
            if lastEncountered == -1:
                ctime += 1
            else:
                if ctime - lastEncountered >= time[arr[i] - 1]:
                    ctime += 1
                else:
                    ctime += time[arr[i] - 1] - (ctime - lastEncountered)
            
            map[arr[i]] = ctime
        
        return ctime