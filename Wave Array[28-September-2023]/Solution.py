# >> PYTHON CODE <<

from typing import List


class Solution:
    def convertToWave(self, n : int, a : List[int]) -> None:
        for i in range(0,n-1,2):
                a[i],a[i+1]=a[i+1],a[i]