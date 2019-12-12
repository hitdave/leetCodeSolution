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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        int cnt = 0;
        while(!qu.isEmpty()){
            cnt = qu.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < cnt; i++){
                TreeNode temp = qu.poll();
                if(temp.left != null) qu.offer(temp.left);
                if(temp.right != null) qu.offer(temp.right);
                level.add(temp.val);
            }
            res.add(level);
        }
        return res;
    }
}