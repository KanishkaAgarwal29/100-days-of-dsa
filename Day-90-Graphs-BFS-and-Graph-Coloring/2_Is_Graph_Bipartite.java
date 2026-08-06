class Solution {

    public boolean dfs(int node, int[] color, int[][] graph) {

        for (int next : graph[node]) {

            if (color[next] == -1) {
                color[next] = 1 - color[node];

                if (!dfs(next, color, graph))
                    return false;
            } else if (color[next] == color[node]) {
                return false;
            }
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int[] color = new int[n];

        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {

            if (color[i] == -1) {
                color[i] = 0;

                if (!dfs(i, color, graph))
                    return false;
            }
        }

        return true;
    }
}
