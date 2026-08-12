class Solution {
    
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, int ver, int parent){
        vis[ver] = 1;
        
        for(int a : adj.get(ver)){
            if(vis[a] == 0){
                if(dfs(adj, vis, a, ver)) return true;
            }
            else if(a != parent) return true;
        }
        
        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        int[] vis = new int[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for( int i = 0; i < V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                if(dfs(adj, vis, i, -1)) return true;
            }
            
        }
        
        return false;
    }
}
