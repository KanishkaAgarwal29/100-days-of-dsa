class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, int ver, int[] path) {
        vis[ver] = 1;
        path[ver] = 1;

        for(int a : adj.get(ver)) {
            if(vis[a] == 0) {
                if(dfs(adj, vis, a, path))
                    return true;
            }
            else if(path[a] == 1) {
                return true;
            }
        }

        path[ver] = 0;
        return false;
    }

    public boolean isCyclic(int V, int[][] edges) {

        int[] vis = new int[V];
        int[] path = new int[V];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }

        for(int i = 0; i < V; i++) {
            if(vis[i] == 0) {
                if(dfs(adj, vis, i, path))
                    return true;
            }
        }

        return false;
    }
}
