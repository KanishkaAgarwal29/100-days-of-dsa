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
    public void leafOrder(TreeNode root, ArrayList<Integer> li) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            li.add(root.val);
        }
        leafOrder(root.left, li);
        leafOrder(root.right, li);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> li1 = new ArrayList<>();
        ArrayList<Integer> li2 = new ArrayList<>();

        leafOrder(root1, li1);
        leafOrder(root2, li2);

        return li1.equals(li2);
    }
}
