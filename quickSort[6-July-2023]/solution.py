#   >> PYTHON CODE <<

class Solution:
    #Function to sort a list using quick sort algorithm.
    def quickSort(self,arr,low,high):
        if(low>=high):
            return
        
        par=self.partition(arr,low,high)
        
        self.quickSort(arr,low,par-1)
        self.quickSort(arr,par+1,high)
    
    def partition(self,arr,low,high):
        pivot=arr[high]
        
        
        i=low
        x=low-1
        while(i<high):
            if(arr[i]<=pivot):
                x+=1
                arr[x],arr[i]=arr[i],arr[x]
            i+=1
        
        arr[x+1],arr[high]=arr[high],arr[x+1]
        return x+1