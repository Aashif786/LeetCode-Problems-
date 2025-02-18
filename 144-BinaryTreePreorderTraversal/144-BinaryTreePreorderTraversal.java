
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        post(root,res);
        return res;
    }

    private void post(TreeNode root, List<Integer> res){
        if(root == null)  return;
        res.add(root.val);
        post(root.left, res);
        post(root.right, res);
    }
}