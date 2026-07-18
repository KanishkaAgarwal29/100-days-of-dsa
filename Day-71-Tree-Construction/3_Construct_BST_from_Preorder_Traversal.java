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
    int i = 0;

    public TreeNode constructTree(int[] pre, int bound) {
        if (i >= pre.length || pre[i] > bound)
            return null;
        TreeNode curr = new TreeNode(pre[i++]);

        curr.left = constructTree(pre, curr.val);
        curr.right = constructTree(pre, bound);

        return curr;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return constructTree(preorder, Integer.MAX_VALUE);
    }
}
