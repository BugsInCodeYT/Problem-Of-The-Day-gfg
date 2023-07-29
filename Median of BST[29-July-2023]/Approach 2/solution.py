def getValueAt(root,med,pos):
    if root==None:
        return
    
    getValueAt(root.left,med,pos)
    if pos[0]==0:
        if med[0]==-1:
            med[0]=root.data
        else:
            med[1]=root.data
    pos[0]-=1
    getValueAt(root.right,med,pos)

def getCount(root):
    if root==None:
        return 0
    
    return 1+getCount(root.left)+getCount(root.right)

def findMedian(root):
    n=getCount(root)
    med=[-1,-1]
    if n%2==0:
        getValueAt(root,med,[n//2-1])
        getValueAt(root,med,[n//2])
        median=med[0]+med[1]
        return median//2 if median%2==0 else float(median/2)
    else:
        getValueAt(root,med,[(n+1)//2-1])
        return med[0]