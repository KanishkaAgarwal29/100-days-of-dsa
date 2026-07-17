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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return root;
        else if(root.val == key) return solve(root);
        TreeNode temp = root;
        while(root != null){
            if(root.val > key){
                if(root.left!=null && root.left.val == key){
                    root.left = solve(root.left);
                }
                else{
                    root= root.left;
                }
            }
            else{
                if(root.right!=null && root.right.val == key){
                    root.right = solve(root.right);
                }
                else{
                    root= root.right;
                }
            }
            
        }
        return temp;
        
    }

    public TreeNode solve(TreeNode root){
            if(root.left == null)return root.right;
            else if(root.right == null)return root.left;

            TreeNode rightChild = root.right;
            TreeNode leftChild = asRightAsPossible(root.left);
            leftChild.right = rightChild;
            return root.left;
        }

        public TreeNode asRightAsPossible(TreeNode root){
            if(root.right == null) return root;
            return asRightAsPossible(root.right);
        }
}
