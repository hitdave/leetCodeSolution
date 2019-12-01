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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length <=0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        TreeNode head = toBST(nums,0,nums.length-1);
        return head;
    }
    
    public TreeNode toBST(int[] nums,int start,int end){
        if(start > end) return null;
        int mid = (start + end)/2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = toBST(nums,start,mid-1);
        head.right = toBST(nums,mid+1,end);
        return head;
    }
}