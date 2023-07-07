#  >> PYTHON CODE <<

class Solution:
    
    #Function to merge the arrays.
    def merge(self,arr1,arr2,n,m):
        # three pointers to iterate
        i = 0
        j = 0
        k = 0
        # for euclid's division lemma
        mod = 10e7 + 1
        # in this loop we are rearranging the elements of arr1
        while i < n and (j < n and k < m):
            # if both arr1 and arr2 elements are modified
            if arr1[j] >= mod and arr2[k] >= mod:
                if arr1[j] % mod <= arr2[k] % mod:
                    arr1[i] += (arr1[j] % mod) * mod
                    j += 1
                else:
                    arr1[i] += (arr2[k] % mod) * mod
                    k += 1
            # if only arr1 elements are modified
            elif arr1[j] >= mod:
                if arr1[j] % mod <= arr2[k]:
                    arr1[i] += (arr1[j] % mod) * mod
                    j += 1
                else:
                    arr1[i] += (arr2[k] % mod) * mod
                    k += 1
            # if only arr2 elements are modified
            elif arr2[k] >= mod:
                if arr1[j] <= arr2[k] % mod:
                    arr1[i] += (arr1[j] % mod) * mod
                    j += 1
                else:
                    arr1[i] += (arr2[k] % mod) * mod
                    k += 1
            # if none elements are modified
            else:
                if arr1[j] <= arr2[k]:
                    arr1[i] += (arr1[j] % mod) * mod
                    j += 1
                else:
                    arr1[i] += (arr2[k] % mod) * mod
                    k += 1
            i += 1
    
        #  we can copy the elements directly as the other array
        #  is exchausted
        while j < n and i < n:
            arr1[i] += (arr1[j] % mod) * mod
            i += 1
            j += 1
        while k < m and i < n:
            arr1[i] += (arr2[k] % mod) * mod
            i += 1
            k += 1
        #  we need to reset i
        i = 0
    
        # in this loop we are rearranging the elements of arr2
        while i < m and (j < n and k < m):
            # if both arr1 and arr2 elements are modified
            if arr1[j] >= mod and arr2[k] >= mod:
                if arr1[j] % mod <= arr2[k] % mod:
                    arr2[i] += (arr1[j] % mod) * mod
                    j += 1
    
                else:
                    arr2[i] += (arr2[k] % mod) * mod
                    k += 1
    
            # if only arr1 elements are modified
            elif arr1[j] >= mod:
                if arr1[j] % mod <= arr2[k]:
                    arr2[i] += (arr1[j] % mod) * mod
                    j += 1
    
                else:
                    arr2[i] += (arr2[k] % mod) * mod
                    k += 1
    
            # if only arr2 elements are modified
            elif arr2[k] >= mod:
                if arr1[j] <= arr2[k] % mod:
                    arr2[i] += (arr1[j] % mod) * mod
                    j += 1
    
                else:
                    arr2[i] += (arr2[k] % mod) * mod
                    k += 1
    
            else:
                # if none elements are modified
                if arr1[j] <= arr2[k]:
                    arr2[i] += (arr1[j] % mod) * mod
                    j += 1
    
                else:
                    arr2[i] += (arr2[k] % mod) * mod
                    k += 1
    
            i += 1
        # we can copy the elements directly as the other array
        # is exhausted
        while j < n and i < m:
            arr2[i] += (arr1[j] % mod) * mod
            i += 1
            j += 1
    
        while k < m and i < m:
            arr2[i] += (arr2[k] % mod) * mod
            i += 1
            k += 1
    
        # we need to reset i
        i = 0
        # we need to divide the whole arr1 by mod
        while i < n:
            arr1[i] = int(arr1[i]//mod)
            i += 1
    
        # we need to reset i
        i = 0
        # we need to divide the whole arr2 by mod
        while i < m:
            arr2[i] = int(arr2[i]//mod)
            i += 1
    