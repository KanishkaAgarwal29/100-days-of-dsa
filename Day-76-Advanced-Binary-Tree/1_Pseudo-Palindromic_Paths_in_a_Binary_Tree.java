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
    int total = 0;

    public void pseudoPaths(TreeNode root, int[] freq, int odd) {
        if (root == null) {
            return;
        }
        int val = root.val;
        freq[val]++;
        if (freq[val] % 2 == 0) {
            odd--;
        } else {
            odd++;
        }
        if (root.left == null && root.right == null) {
            if (odd <= 1)
                total++;
        }
        pseudoPaths(root.left, freq, odd);
        pseudoPaths(root.right, freq, odd);
        freq[val]--;
    }

    public int pseudoPalindromicPaths(TreeNode root) {
        int[] freq = new int[10];AC
        pseudoPaths(root, freq, 0);
        return total;
    }
}
