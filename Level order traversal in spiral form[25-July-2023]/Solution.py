#  >> PYTHON CODE <<

def reverse(lst, st, end):
    while st < end:
        lst[st], lst[end] = lst[end], lst[st]
        st += 1
        end -= 1

def findSpiral(root):
    ans = []
    q = deque()
    level = 0
    q.append(root)
    while q:
        size = len(q)
        st = len(ans)
        end = len(ans) + size - 1
        for i in range(size):
            nn = q.popleft()
            ans.append(nn.data)
            if nn.left:
                q.append(nn.left)
            if nn.right:
                q.append(nn.right)
        if level % 2 == 0:
            reverse(ans, st, end)
        level += 1
    return ans