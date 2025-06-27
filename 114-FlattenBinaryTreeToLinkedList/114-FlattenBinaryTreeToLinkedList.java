// Last updated: 6/27/2025, 11:44:05 AM
class Solution { 
    private TreeNode prev = null; 
    public void flatten(TreeNode root) { 
        if (root == null) return; 
        flatten(root.right); 
        flatten(root.left); 
        root.right = prev; 
        root.left = null; 
        prev = root; 
    } 
}