class Solution {
    public boolean isSymmetric(TreeNode root) {
        return sym(root.right , root.left);
    }
    public boolean sym(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null ) return true;
        else if(n1 == null || n2 == null || n1.val != n2.val ) return false;
        else return sym(n1.left , n2.right) && sym(n1.right , n2.left);
    }

}