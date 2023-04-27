#  >> PYTHON CODE <<


class SegmentTree:
    def __init__(self, s):
        n = len(s)
        self.tree = [[0]*(26) for _ in range(4*n)]
        self.buildTree(s, 0, n - 1, 0)

    def buildTree(self, s, left, right, index = 0):
        if left == right:
            self.tree[index][ord(s[left])-ord("a")]+=1
            return

        mid = (left + right) // 2
        self.buildTree(s, left, mid, 2 * index + 1)
        self.buildTree(s, mid + 1, right, 2 * index + 2)
        for c in range(26):
            
            self.tree[index][c] = self.tree[2 * index + 1][c] + self.tree[2 * index + 2][c]
    def update(self, s,left, right, pos, char,index = 0):
        if pos < left or pos > right:
            return

        if left == right:
            self.tree[index][ord(s[pos])-ord("a")] -=1
            s[pos]=char
            self.tree[index][ord(s[pos])-ord("a")] +=1
            return

        mid = (left + right) // 2
        if pos <= mid:
            self.update(s,left, mid, pos, char,2 * index + 1)
        else:
            self.update(s,mid + 1, right, pos, char,2 * index + 2)

        for c in range(26):
            
            self.tree[index][c] = self.tree[2 * index + 1][c] + self.tree[2 * index + 2][c]
    def query(self, left, right, i, j, index = 0):
        if right < i or left > j:
            return [0]*26

        if i <= left and right <= j:
            return self.tree[index]

        mid = (left + right) // 2
        temp=[0]*(26)
        
        res1=self.query(left, mid, i, j, 2 * index + 1)
        res2=self.query(mid + 1, right, i, j,2 * index + 2)
        for c in range(26):
            temp[c]=res1[c]+res2[c]
        return temp
class Solution:
    def easyTask(self,n,s,q,queries):
        s=[el for el in s]
        seg=SegmentTree(s)
        res=[]
        for quer in queries:
            if quer[0]=="1":
                seg.update(s,0,n-1,int(quer[1]),quer[2])
            else:
                char_freq=seg.query(0,n-1,int(quer[1]),int(quer[2]))
                k=int(quer[3])
                for c in range(25,-1,-1):
                    k-=min(k,char_freq[c])
                    if k==0:
                        res.append(chr(ord("a")+c))
                        break
        return res