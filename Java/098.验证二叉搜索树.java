/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isBST(TreeNode root , long left, long right){
        if(root == null) return true;
        if(root.val <= left || root.val >= right) return false;
        return isBST(root.left, left, root.val) && isBST(root.right, root.val, right);
    }
}