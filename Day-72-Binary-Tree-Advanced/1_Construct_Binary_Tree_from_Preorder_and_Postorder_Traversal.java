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
    public TreeNode constructTree(int[] pre, HashMap<Integer,Integer> mpp, int preS, int postS, int postE){
        if(postE < postS)return null;

        TreeNode root = new TreeNode(pre[preS]);
        if(postS == postE ) return root;
        int i = mpp.get(pre[preS + 1]);
        int leftSize = i - postS + 1;
        root.left = constructTree(pre, mpp, preS + 1, postS, i);
        root.right = constructTree(pre, mpp, preS + leftSize + 1, i + 1, postE - 1);
        
        return root;
    }

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i < post.length; i++){
            mpp.put(post[i], i);
        }
        return constructTree(pre, mpp, 0, 0, post.length - 1);
    }
}
