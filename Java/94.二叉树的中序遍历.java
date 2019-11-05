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
    //递归解法
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        dfs(root, res);
        return res;
    }

    public static void dfs(TreeNode root, List<Integer> res){
        if(root == null) return;
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }

    //非递归解法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> sk = new Stack<>();
        if(root == null) return res;
        TreeNode cur = root;
        while(!sk.isEmpty() || cur != null){
            while(cur!= null){
                sk.push(cur);
                cur = cur.left;
            }
            TreeNode temp = sk.pop();
            res.add(temp.val);
            cur = temp.right;
        }
        return res;
    }

}