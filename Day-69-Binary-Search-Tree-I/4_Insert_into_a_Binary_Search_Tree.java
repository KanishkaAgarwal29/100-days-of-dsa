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
    TreeNode prev = null;
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode t =  new TreeNode(val);
            if(prev == null){
                return t;
            }
            else if(prev.val > val){
                prev.left = t;
            }
            else{
                prev.right = t;
            }
            return root;
        }

        if(root.val > val){
            prev = root;
            insertIntoBST(root.left, val);
        }
        else{
            prev = root;
            insertIntoBST(root.right, val);
        }
        return root;
    }
}
