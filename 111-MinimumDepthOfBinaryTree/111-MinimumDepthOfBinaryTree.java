// Last updated: 6/27/2025, 11:44:09 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int count = 1;
        if(root.left == null) return count + minDepth(root.right);
        else if(root.right == null) return count + minDepth(root.left);
        int left  = count + minDepth(root.left );
        int right = count + minDepth(root.right);
        return (left < right)? left : right;
    }
}