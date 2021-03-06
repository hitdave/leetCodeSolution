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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isRightFuc(root.left, root.right);
        }

    public static boolean isRightFuc(TreeNode l, TreeNode r){
        if(l == null && r == null) return true;
        if(l == null || r == null) return false;
        if(l.val == r.val){
            return isRightFuc(l.left,r.right) && isRightFuc(l.right, r.left); 
        }
        return false;
    }
}

    
