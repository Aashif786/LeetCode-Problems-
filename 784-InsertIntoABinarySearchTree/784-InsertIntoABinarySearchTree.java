// Last updated: 6/27/2025, 11:42:38 AM
/**
 * Definition for a binary tree TreeNode.
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode nn = new TreeNode(val);
        if (root == null) return nn;
        if (val < root.val) root.left = insertIntoBST(root.left , val);
        else if (val > root.val) root.right = insertIntoBST(root.right , val);
        return root;
    }
}