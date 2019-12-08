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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> sk = new Stack<>();
        sk.push(root);
        while(!sk.isEmpty()){
            TreeNode cur = sk.pop();
            if(cur==null) continue;
            res.add(cur.val);
            sk.push(cur.left);
            sk.push(cur.right);
        }
        Collections.reverse(res);
        return res;
    }
}