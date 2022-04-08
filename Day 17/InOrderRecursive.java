// In-Order Traversal

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        addNodes(traversal, root);
        return traversal;
    }
    
    public static void addNodes(List<Integer> traversal, TreeNode root) {
        if (root != null) {
            addNodes(traversal, root.left);
            traversal.add(root.val);
            addNodes(traversal, root.right);
        }
    }
}
