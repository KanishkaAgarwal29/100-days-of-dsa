// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
	
	public int leftLeavesSum(Node root) {
		// code here
		if (root == null)return 0;
		int sum = 0;
		if (root.left != null && root.left.left == null && root.left.right == null)sum += root.left.data;
		return sum + leftLeavesSum(root.left) + leftLeavesSum(root.right);
	}
}
