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
    int count = 0;

    public void countGoodNodes(TreeNode root, int max) {
        if (root == null)
            return;
        if (root.val >= max)
            count++;

        int currMax = Math.max(max, root.val);
        countGoodNodes(root.left, currMax);
        countGoodNodes(root.right, currMax);
    }

    public int goodNodes(TreeNode root) {
        countGoodNodes(root, Integer.MIN_VALUE);
        return count;
    }
}
