//  >> C++ CODE <<

void reverse(vector<int>& list, int st, int end)
{
    while (st < end)
    {
        int temp = list[st];
        list[st] = list[end];
        list[end] = temp;
        st++;
        end--;
    }
}
vector<int> findSpiral(Node* root)
{
    vector<int> ans;
    queue<Node*> q;
    int level = 0;
    q.push(root);
    while (!q.empty())
    {
        int size = q.size();
        int st = ans.size();
        int end = ans.size() + size - 1;
        for (int i = 0; i < size; i++)
        {
            Node* nn = q.front();
            q.pop();
            ans.push_back(nn->data);
            if (nn->left)
                q.push(nn->left);
            if (nn->right)
                q.push(nn->right);
        }
        if (level % 2 == 0)
        {
            reverse(ans, st, end);
        }
        level++;
    }
    return ans;
}