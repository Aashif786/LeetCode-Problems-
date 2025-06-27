// Last updated: 6/27/2025, 11:43:02 AM
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) 
    {
        if(root == null) return null;
        if (key < root.val)
            root.left = deleteNode(root.left, key);
        else if (key > root.val)
            root.right = deleteNode(root.right, key);
        else {
            if (root.right == null)
                return root.left;
            else if (root.left == null)
                return root.right;
            else {
                TreeNode temp = predec(root.left);
                root.val = temp.val;
                root.left = deleteNode(root.left, temp.val);
            }
        }
        return root;
    }
    public TreeNode predec(TreeNode root) {
        while (root.right != null)
            root = root.right;
        return root;
    }
}