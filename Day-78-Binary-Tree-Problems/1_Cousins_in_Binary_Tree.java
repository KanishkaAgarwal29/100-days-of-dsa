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
    int depthx = -1;
    int depthy = -1;
    TreeNode parentx = null;
    TreeNode parenty = null;

    public void findDepth(TreeNode root, int depth, TreeNode parent, int x, int y) {
        if (root == null)
            return;
        if (depthx != -1 && depthy != -1)
            return;
        if (root.val == x) {
            parentx = parent;
            depthx = depth;
            return;
        } else if (root.val == y) {
            parenty = parent;
            depthy = depth;
            return;
        }

        findDepth(root.left, depth + 1, root, x, y);
        findDepth(root.right, depth + 1, root, x, y);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        findDepth(root, 0, null, x, y);
        return depthx == depthy && parentx != parenty;
    }
}
