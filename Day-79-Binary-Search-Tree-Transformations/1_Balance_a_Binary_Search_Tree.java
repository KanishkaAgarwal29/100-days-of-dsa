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
    List<TreeNode> inorder = new ArrayList<>();
    public void createArray(TreeNode root) {
        if (root == null)
            return;
        createArray(root.left);
        inorder.add(root);
        createArray(root.right);
    }

    public TreeNode createTree(int low, int high) {
        if (low > high)
            return null;
        int mid = low + (high - low) / 2;
        TreeNode node = inorder.get(mid);
        node.left = createTree(low, mid - 1);
        node.right = createTree(mid + 1, high);
        return node;
    }

    public TreeNode balanceBST(TreeNode root) {
        createArray(root);
        return createTree(0, inorder.size() - 1);
    }
}
