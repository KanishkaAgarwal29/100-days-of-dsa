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

class Pair {
    TreeNode node;
    int col;
    int row;

    Pair(TreeNode node, int col, int row) {
        this.node = node;
        this.col = col;
        this.row = row;
    }
}

class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, PriorityQueue<Pair>> mpp = new TreeMap<>();

        Queue<Pair> q = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();

        q.offer(new Pair(root, 0, 0));

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            mpp.putIfAbsent(curr.col, new PriorityQueue<>((a, b) -> {
                if (a.row == b.row)
                    return Integer.compare(a.node.val, b.node.val);

                return Integer.compare(a.row, b.row);
            }));

            mpp.get(curr.col).offer(curr);

            if (curr.node.left != null)
                q.offer(new Pair(curr.node.left, curr.col - 1, curr.row + 1));

            if (curr.node.right != null)
                q.offer(new Pair(curr.node.right, curr.col + 1, curr.row + 1));
        }

        for (PriorityQueue<Pair> pq : mpp.values()) {

            List<Integer> list = new ArrayList<>();

            while (!pq.isEmpty())
                list.add(pq.poll().node.val);

            ans.add(list);
        }

        return ans;
    }
}
