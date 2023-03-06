class Solution{
  public:
    int maxLevelSum(Node* root) {

        queue<Node*> q;
            q.push(root);

            int maxSum=INT_MIN;

            while(!q.empty()) {
                int size=q.size();

		    //Current Level Sum..
                int levelSum=0;

                for(int i=0; i<size; i++) {
                    Node* nn=q.front();
                    q.pop();

                    levelSum += nn->data;

                    if(nn->left != NULL) {
                        q.push(nn->left);
                    }
                    if(nn->right != NULL) {
                        q.push(nn->right);
                    }
                }

		   //Maximum Level Sum..
                maxSum=max(maxSum, levelSum);
            }

            return maxSum;
    }
};