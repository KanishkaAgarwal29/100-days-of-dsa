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
    TreeNode head = new TreeNode(-1);
    TreeNode prev = head;

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);

        root.left = null;
        prev.right = root;
        prev = prev.right;
        
        inorder(root.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return head.right;
    }
}
