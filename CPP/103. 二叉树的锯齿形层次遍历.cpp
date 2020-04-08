/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
#include <queue>
class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> res;
        if(root == NULL) return res;
        queue<TreeNode*> qu;
        qu.push(root);
        bool order = false;
        while(!qu.empty()){
            int n = qu.size();
            vector<int> temp;
            for(int i = 0; i < n; i++){
                TreeNode* current = qu.front();
                qu.pop();
                if(current->left != NULL) qu.push(current->left);
                if(current->right != NULL)qu.push(current->right);
                if(order){
                    temp.insert(temp.begin(),1,current->val);
                }else{
                    temp.push_back(current->val);
                }
            }
            order = !order;
            res.push_back(temp);
        }
        return res;        
    }
};