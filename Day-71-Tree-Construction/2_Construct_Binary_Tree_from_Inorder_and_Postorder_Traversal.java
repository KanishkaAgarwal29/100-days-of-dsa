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
    public TreeNode constructTree(int[] post, HashMap<Integer, Integer> in, int postS, int postE, int inS, int inE) {
        if (inE < inS)
            return null;
        TreeNode root = new TreeNode(post[postE]);
        int i = in.get(post[postE]);

        root.left = constructTree(post, in, postS, postS + (i - inS) - 1, inS, i - 1);
        root.right = constructTree(post, in, postS + (i - inS), postE - 1, i + 1, inE);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            mpp.put(inorder[i], i);
        }

        return constructTree(postorder, mpp, 0, postorder.length - 1, 0, inorder.length - 1);
    }
}
