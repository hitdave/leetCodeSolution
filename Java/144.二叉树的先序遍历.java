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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> sk = new Stack<>();
        sk.push(root);
        while(!sk.isEmpty()){
            TreeNode temp = sk.pop();
            if(temp == null) continue;
            res.add(temp.val);
            sk.push(temp.right);
            sk.push(temp.left);
        }
        return res;
    }
}