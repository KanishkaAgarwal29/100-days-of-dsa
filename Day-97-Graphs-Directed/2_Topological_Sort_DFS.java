class Solution {
    
    public void dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, 
                    int ver, Stack<Integer> st) {
        
        vis[ver] = 1;
        
        for(int a : adj.get(ver)) {
            if(vis[a] == 0) {
                dfs(adj, vis, a, st);
            }
        }
        
        st.push(ver);
    }
    
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < V; i++) {
            if(vis[i] == 0) {
                dfs(adj, vis, i, st);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(!st.isEmpty()) {
            ans.add(st.pop());
        }
        
        return ans;
    }
}
