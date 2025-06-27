// Last updated: 6/27/2025, 11:44:08 AM
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return targetSum == root.val;
        targetSum -= root.val;
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}