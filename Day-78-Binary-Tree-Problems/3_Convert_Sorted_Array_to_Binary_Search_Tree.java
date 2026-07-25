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

    public TreeNode buildTree(int low, int high, int[] nums){
        if(low > high){
            return null;
        }

        int mid = low + (high - low)/2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildTree(low, mid - 1, nums);
        root.right = buildTree(mid + 1, high, nums);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length - 1;
        return buildTree(0, n, nums);
    }
}
