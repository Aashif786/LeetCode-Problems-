import java.util.*;
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }
    
    private void dfs(TreeNode node, List<Integer> result) {
        if (node == null) return;
        dfs(node.left, result);       // Traverse left subtree
        dfs(node.right, result);      // Traverse right subtree
        result.add(node.val);         // Visit root
    }
}