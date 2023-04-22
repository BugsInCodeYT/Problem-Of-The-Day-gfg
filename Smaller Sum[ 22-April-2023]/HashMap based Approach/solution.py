#   >> PYTHON CODE <<


class Solution:
    
    def smallerSum(self, n : int, arr : List[int]) -> List[int]:
        hashmap = {}
        ans = []
        arrcpy = arr.copy()
        
        arrcpy.sort()
        
        prefixSum = arrcpy[0]
        hashmap[arrcpy[0]] = 0
        
        for i in range(1, n):
            if arrcpy[i-1] == arrcpy[i]:
                sum = hashmap[arrcpy[i-1]]
                hashmap[arrcpy[i]] = sum
            else:
                hashmap[arrcpy[i]] = prefixSum
            
            prefixSum += arrcpy[i]
        
        for i in range(n):
            ans.append(hashmap[arr[i]])
        
        return ans