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
    int maxCount = 0;

    public void ZigZag(TreeNode root, char c, int count) {
        if (root == null) {
            return;
        }
        
        maxCount = Math.max(maxCount, count);
        
        if (c == 'R') {
            ZigZag(root.left, 'L', count + 1);
            ZigZag(root.right, 'R', 1);
        } else {
            ZigZag(root.right, 'R', count + 1);
            ZigZag(root.left, 'L', 1);
        }
    }

    public int longestZigZag(TreeNode root) {
        ZigZag(root.left, 'L', 1);
        ZigZag(root.right, 'R', 1);
        return maxCount;
    }
}
