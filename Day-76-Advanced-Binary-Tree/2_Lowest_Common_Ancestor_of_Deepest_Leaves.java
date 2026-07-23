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
class Pair{
    TreeNode node;
    int height;

    Pair(TreeNode node, int height){
        this.node = node;
        this.height = height;
    }
}
class Solution {
    public Pair lcaHeight(TreeNode root){
        if(root == null){
            return new Pair(null,0);
        }

        Pair left = lcaHeight(root.left);
        Pair right = lcaHeight(root.right); 

        if(left.height == right.height){
            return new Pair(root, left.height + 1);
        }
        else if(left.height < right.height){
            return new Pair(right.node, right.height + 1);
        }
        else{
            return new Pair(left.node, left.height + 1);
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return lcaHeight(root).node;
    }
}
