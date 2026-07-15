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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return ans;
        q.offer(root);
        boolean LR = true;

        while (!q.isEmpty()) {
            int size = q.size();
            Integer[] li = new Integer[size];

            for (int i = 0; i < size; i++) {
                root = q.poll();
                int idx = LR ? i : size - 1 - i;
                li[idx] = root.val;

                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }
            }
            LR = !LR;
            ans.add(Arrays.asList(li));
        }
        return ans;
    }
}
