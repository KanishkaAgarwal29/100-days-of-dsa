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
    public TreeNode searchNode(TreeNode root, int low, int high){
        if(root == null)return null;

        if(root.val < low){
            return searchNode(root.right, low, high);
        }
        else if(root.val > high){
            return searchNode(root.left, low, high);
        }
        else{
            root.left = searchNode(root.left, low, high);
            root.right = searchNode(root.right, low, high);
        }
        return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return searchNode(root, low, high);
    }
}
