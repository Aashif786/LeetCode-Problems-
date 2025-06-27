// Last updated: 6/27/2025, 11:44:07 AM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) { 
        List<List<Integer>> a = new ArrayList<>(); 
        path(root, new ArrayList<>(), targetSum, a);
        return a;
    }
    private void path(TreeNode root, List<Integer> curr, int target, List<List<Integer>> a){
        if(root == null) return;
        curr.add(root.val);
        if(root.left == null && root.right == null && target == root.val) a.add(new ArrayList<>(curr));
        else{
            path(root.left , curr, target - root.val ,a);
            path(root.right, curr, target - root.val ,a);
        }
        curr.remove(curr.size() - 1);
    } 
}