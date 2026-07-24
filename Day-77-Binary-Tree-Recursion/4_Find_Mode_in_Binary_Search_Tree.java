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
    int maxCount = 0;
    TreeNode prev = null;

    ArrayList<Integer> list = new ArrayList<>();

    public void inorder(TreeNode root) {

        if (root == null) return;

        inorder(root.left);

        if (prev == null || prev.val != root.val) {
            count = 1;
        } else {
            count++;
        }

        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(root.val);
        } else if (count == maxCount) {
            list.add(root.val);
        }

        prev = root;

        inorder(root.right);
    }

    public int[] findMode(TreeNode root) {

        inorder(root);

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
