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
    public TreeNode constructTree(int[] pre, HashMap<Integer, Integer> in, int preS, int inS, int inE) {
        if (inE < inS)
            return null;
        TreeNode root = new TreeNode(pre[preS]);
        int i = in.get(pre[preS]);

        root.left = constructTree(pre, in, preS + 1, inS, i - 1);
        root.right = constructTree(pre, in, preS + (i - inS) + 1, i + 1, inE);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            mpp.put(inorder[i], i);
        }

        return constructTree(preorder, mpp, 0, 0, inorder.length - 1);
    }
}
