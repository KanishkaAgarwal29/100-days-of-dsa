class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination)
            return true;
        int[] vis = new int[n];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(source);
        vis[source] = 1;

        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int e : adj.get(curr)) {
                if (vis[e] == 0) {
                    if (e == destination)
                        return true;

                    vis[e] = 1;
                    q.offer(e);
                }
            }
        }

        return false;
    }
}
