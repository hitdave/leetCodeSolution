/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    bool isValidBST(TreeNode* root) {
        if(root == NULL) return true;
        return isBST(root, LONG_MIN, LONG_MAX);
    }

    bool isBST(TreeNode* root, long left, long right){
        if(root == NULL) return true;
        if(root->val <= left || root->val >= right){
            return false;
        }
        return isBST(root->left,left,root->val) && isBST(root->right,root->val,right);

    }

};