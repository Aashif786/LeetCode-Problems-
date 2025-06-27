// Last updated: 6/27/2025, 11:42:41 AM
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(val < root.val) root = searchBST(root.left , val);
        else if(val > root.val) root = searchBST(root.right , val);
        return root;
    }
}